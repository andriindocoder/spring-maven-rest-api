package com.andriwicaksono.restapimavenproject.repository;

import com.andriwicaksono.restapimavenproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
