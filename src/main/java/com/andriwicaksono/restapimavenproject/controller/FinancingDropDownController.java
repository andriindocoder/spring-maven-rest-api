package com.andriwicaksono.restapimavenproject.controller;

import com.andriwicaksono.restapimavenproject.entity.User;
import com.andriwicaksono.restapimavenproject.model.RegisterUserRequest;
import com.andriwicaksono.restapimavenproject.model.UpdateUserRequest;
import com.andriwicaksono.restapimavenproject.model.UserResponse;
import com.andriwicaksono.restapimavenproject.model.WebResponse;
import com.andriwicaksono.restapimavenproject.service.UserService;
import com.andriwicaksono.restapimavenproject.dtos.FinancingCustomerInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor
@Slf4j
public class FinancingDropDownController {

    // @Autowired
    // private UserService userService;

    // private final FinancingDropdownsService dropdownsService;

    @GetMapping("/financing/dropdowns")
    public ResponseEntity<FinancingCustomerInfoDto> getInfos() {
        log.debug("/financing/dropdowns..........");
        return null;
    }


    @GetMapping("/financing/evict-cache")
    public ResponseEntity<String> evictCache() {
        return null;
    }

    @PostMapping("/financing/customer-create")
    public ResponseEntity<String> saveCustomer() {
        log.debug("/financing/add-customer...................");
        return null;
    }

    @GetMapping("/financing/customer-get/{icNo}")
    public ResponseEntity<?> getCustomer(@PathVariable String icNo) {
        log.debug("/financing/get-customer..........");
        // CustomerDto customer = customerService.getCustomer(icNo);
        return null;
    }

    @PostMapping("/financing/customer-delete/{appNo}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("appNo") Long appNo, @RequestParam(name = "reason") String reason) {
        log.debug("/financing/delete-customer/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing/occupations")
    public ResponseEntity<?> getOccupations() {
        log.debug("/financing/occupations..........");
        return null;
    }

    @PostMapping(path = "/financing/calculate")
    public ResponseEntity<String> getAffordability(
    ) {
        log.debug("/financing/calculate.......");
        return null;
    }

    @GetMapping(path = "/financing/start-variables")
    public ResponseEntity<String> getPageLoadVaraibles() {
        log.debug("/financing/start-variables.......");
        return null;
    }

    @PatchMapping("/financing/update-customer")
    public ResponseEntity<String> updateCustomer(){
        log.debug("/financing/customer-update..........");
        return null;
    }

    @GetMapping("/financing/customers/{id}")
    public ResponseEntity<String> getEtbCustomerDetails(@PathVariable("id") String id) {
        log.debug("Into /financing/customers/{id}");
        return null;
    }

    @GetMapping("/financing/customers/{id}/address")
    public ResponseEntity<String> getEtbCustomerAddress(@PathVariable("id") String id) {
        log.debug("Into /financing/customers/{id}/address");
        return null;
    }

    @PostMapping("/financing/customer-doc-upload")
    public ResponseEntity<String> uploadFile(
        @RequestParam(name = "suffix", required = false) String suffix,
        @RequestParam(name = "icNo", required = false) String icNo,
        @RequestParam(name = "fileNo", required = false) int fileNo,
        @RequestParam(name = "docType", required = false) String docType,
        @RequestParam(name = "deviceFilePath", required = false) String deviceFilePath
    ) {
        log.debug("/financing/customer-doc-upload : {}", suffix);
        return null;
    }

    @DeleteMapping("/financing/customer-doc-delete/{id}")
    public ResponseEntity<Object> deleteCustomerFile(@PathVariable("id") String id) {
        log.debug("/financing/customer-doc-delete/{id}");
        return null;
    }

    @GetMapping("/financing/customer-doc-list/{appNo}")
    public ResponseEntity<String> getCustomerFilesThumbnails(@PathVariable("appNo") String appNo) {
        log.debug("/financing/customer-doc-list/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing/customer-doc-download/{id}")
    public ResponseEntity<?> getFile(@PathVariable String id) {
        log.debug("/financing/customer-doc-download/{id} : {}", id);
        return null;
    }

    @GetMapping("/financing/tenures")
    public ResponseEntity<String> getTenuresWithProfitRate() {
        log.debug("/financing/tenures");
        return null;
    }

    @PostMapping("/financing/customer-reject")
    public ResponseEntity<String> applicationRejection(@RequestParam(name = "icNo") String icNo, @RequestParam(name = "appNo") Long appNo) {
        log.debug("/financing/customer-reject");
        return null;
    }

    @GetMapping("/financing/cancellation-reasons")
    public ResponseEntity<String> getAllCancellationReasons() {
        log.debug("/financing/cancellation-reasons");
        return null;
    }

    @GetMapping("/financing/financing-details/{appNo}")
    public ResponseEntity<String> getFinancingDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing/financing-details : {}", appNo);
        return null;
    }

    @GetMapping("/financing/financing-account_details/{appNo}")
    public ResponseEntity<String> getFinancingAccountDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing/financing-account_details/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing/financing-transaction_history/{appNo}")
    public ResponseEntity<String> getTransactionHistory(
        @PathVariable("appNo") Long appNo,
        @RequestParam("startDate") String startDate,
        @RequestParam("endDate") String endDate
    ) {
        log.debug("/financing/financing-transaction_history/appNo : {}", appNo);
        return null;
    }

}
