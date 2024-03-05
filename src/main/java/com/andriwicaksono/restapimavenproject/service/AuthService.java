package com.andriwicaksono.restapimavenproject.service;

import com.andriwicaksono.restapimavenproject.entity.User;
import com.andriwicaksono.restapimavenproject.model.LoginUserRequest;
import com.andriwicaksono.restapimavenproject.model.TokenResponse;
import com.andriwicaksono.restapimavenproject.repository.UserRepository;
import com.andriwicaksono.restapimavenproject.security.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ValidationService validationService;

    @Transactional
    public TokenResponse login(LoginUserRequest request) {
        validationService.validate(request);

        User user = userRepository.findById(request.getUsername())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Wrong username or password"));

        if (BCrypt.checkpw(request.getPassword(), user.getPassword())) {
            user.setToken(UUID.randomUUID().toString());
            user.setTokenExpiredAt(next30Days());
            userRepository.save(user);

            return TokenResponse.builder()
                    .token(user.getToken())
                    .expiredAt(user.getTokenExpiredAt())
                    .build();
        } else {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Wrong username or password");
        }

    }

    @Transactional
    public void logout(User user) {
        user.setToken(null);
        user.setTokenExpiredAt(null);

        userRepository.save(user);
    }

    private Long next30Days() {
        return System.currentTimeMillis() + (1000 * 60 * 24 * 30);
    }


}
