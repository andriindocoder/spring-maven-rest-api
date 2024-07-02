package com.andriwicaksono.restapimavenproject.controller;

import com.andriwicaksono.restapimavenproject.entity.User;
import com.andriwicaksono.restapimavenproject.model.LoginUserRequest;
import com.andriwicaksono.restapimavenproject.model.TokenResponse;
import com.andriwicaksono.restapimavenproject.model.WebResponse;
import com.andriwicaksono.restapimavenproject.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
import java.util.concurrent.Callable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@Slf4j
public class InternalController {
    @GetMapping("/all-applications")
    public ResponseEntity<String> getAllCustomers(@RequestParam(value = "q", required = false) String q, Pageable pageable) {
        log.debug("/internal/all-applications");
        return null;
    }

    @GetMapping("/financing-opera/status-list")
    public ResponseEntity<List<String>> getAllStatus() {
        log.debug("/financing-opera/status-list");
        return null;
    }

    @GetMapping("/financing-opera/sub-status-list")
    public ResponseEntity<List<String>> getAllSubStatus() {
        log.debug("/financing-opera/sub-status-list");
        return null;
    }

    @GetMapping("/financing-opera/holiday-list")
    public ResponseEntity<Object> getAllHolidays(
        @RequestParam(value = "q", required = false) String q,
        Pageable pageable
    ) {
        log.debug("/financing-opera/holiday-list");
        return null;
    }

    @GetMapping("/financing-opera/customer-details/{appId}")
    public ResponseEntity<Object> getApplicationDetails(
        @PathVariable("appId") Long appId,
        @RequestParam("userName") String userName
    ) {
        log.debug("/financing-opera/customer-details/{appId} : {}", appId);
        return null;
    }

    @PostMapping("/financing-opera/application-reject")
    public ResponseEntity<String> rejectCustomerApplication() {
        log.debug("/financing-opera/application-reject/{appId} : {}");
        return null;
    }

    @GetMapping("/financing-opera/rejection-reasons")
    public ResponseEntity<List<String>> getRejectionReasons() {
        log.debug("/financing-opera/rejection-reasons");
        return null;
    }

    @GetMapping("/financing-opera/cancellation-reasons")
    public ResponseEntity<List<String>> getCancellationReasons() {
        log.debug("/financing-opera/cancellation-reasons");
        // List<String> cancellationReasons = customerListService.getAllCancellationReasons();
        // cancellationReasons.add(CancellationReasonDto.builder().ordering(5).reason("No response from customer").build());
        return null;
    }

    @PostMapping("/financing-opera/application-cancel")
    public ResponseEntity<String> cancelApplication() {
        log.debug("/financing-opera/application-cancel");
        return null;
    }

    @PostMapping("/financing-opera/upload-doc/{appNo}")
    public ResponseEntity<String> uploadUserFile(
        @PathVariable("appNo") String appNo,
        @RequestParam(name = "docType", required = true) String docType,
        @RequestParam(name = "userName", required = true) String userName,
        @RequestBody byte[] array,
        @RequestParam(name = "fileName") String fileName,
        @RequestParam(name = "section", required = false) String section
    ) throws IOException {
        log.debug("/financing-opera/upload-doc");
        return null;
    }

    @GetMapping("/financing-opera/doc-info/{id}")
    public ResponseEntity<String> getFileInfo(@PathVariable("id") String id, @RequestParam(name = "userName") String userName) {
        log.debug("/financing-opera/doc-info/{id} : {}", id);
        return null;
    }

    @GetMapping("/financing-opera/all-files/{appId}")
    public ResponseEntity<List<String>> getAllFiles(@PathVariable("appId") String appId) {
        log.debug("/financing-opera/all-files/{appId} : {}", appId);
        return null;
    }

    @PostMapping("/financing-opera/delete-doc")
    public ResponseEntity<String> deleteUserDocument() {
        log.debug("/financing-opera/delete-doc : {}");
        return null;
    }

    @GetMapping("/financing-opera/cif-details/{appNo}")
    public ResponseEntity<List<String>> getCIFDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/cif-details/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/aml-risk-profiling/{appNo}")
    public ResponseEntity<List<String>> getAmlAndRiskProfilingDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/aml-risk-profiling/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/pre-screening/{appNo}")
    public ResponseEntity<List<String>> getPreScreeningDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/pre-screening/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/credit-assessment/{appNo}")
    public ResponseEntity<List<String>> getCreditAssessmentDetails(@PathVariable("appNo") Long appNo)
        throws JsonMappingException, JsonProcessingException {
        log.debug("/financing-opera/credit-assessment/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/credit-scoring/{appNo}")
    public ResponseEntity<List<String>> getCreditScoringDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/credit-scoring/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/credit-grades")
    public ResponseEntity<List<String>> getCreditScoringValues() {
        log.debug("/financing-opera/credit-grades");
        return null;
    }

    @GetMapping("/financing-opera/financing-details/{appNo}")
    public ResponseEntity<List<String>> getFinancingDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/financing-details/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/approval-details/{appNo}")
    public ResponseEntity<List<String>> getApprovalDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/approval-details/{appNo} : {}", appNo);
        return null;
    }

    @PostMapping("/financing-opera/doc-status-tab")
    public ResponseEntity<String> updateCustomer() {
        log.debug("/financing-opera/doc-status-tab");
        return null;
    }

    @GetMapping("/financing-opera/acceptance-details/{appNo}")
    public ResponseEntity<List<String>> getAcceptanceDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/acceptance-details/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/pre-disbursement-details/{appNo}")
    public ResponseEntity<List<String>> getPreDisbursementDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/pre-disbursement-details/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/cif-relationship-details/{appNo}")
    public ResponseEntity<List<String>> getCifRelationshipDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/cif-relationship-details/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/post-disbursement-details/{appNo}")
    public ResponseEntity<List<String>> getPostDisbursementDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/post-disbursement-details/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/account-info/{appNo}")
    public ResponseEntity<List<String>> getFinancingAccountInformation(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/account-info/{appNo} : {}", appNo);
        return null;
    }

    @PostMapping("/financing-opera/tab2-details")
    public ResponseEntity<String> updateTab2Details() {
        log.debug("/financing-opera/tab2-details : {}");
        return null;
    }

    @GetMapping("/financing-opera/tab2-details/{appNo}")
    public ResponseEntity<String> getTab2Details(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/tab2-details/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/doc-status-details/{appNo}")
    public ResponseEntity<String> getDocStatusSectionDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/doc-status-details/{appNo} : {}", appNo);
        return null;
    }

    @PostMapping("/financing-opera/tab3-details")
    public ResponseEntity<String> updateTab3Details() {
        log.debug("/financing-opera/tab3-details : {}");
        return null;
    }

    @GetMapping("/financing-opera/tab3-details/{appNo}")
    public ResponseEntity<String> getTab3Details(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/tab3-details/{appNo} : {}", appNo);
        return null;
    }

    @PostMapping("/financing-opera/tab4-details")
    public ResponseEntity<String> updateTab4Details() {
        log.debug("/financing-opera/tab4-details : {}");
        return null;
    }

    @GetMapping("/financing-opera/tab4-details/{appNo}")
    public ResponseEntity<String> getTab4Details(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/tab4-details/{appNo} : {}", appNo);
        return null;
    }

    @PostMapping("/financing-opera/approve-application/{appNo}")
    public ResponseEntity<String> approveApplication(@PathVariable("appNo") Long appNo, @RequestParam(name = "userName") String userName) {
        log.debug("/financing-opera/approve-application/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/acceptance-status/{appNo}")
    public ResponseEntity<String> getAcceptanceDetail(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/acceptance-status/{appNo} : {}", appNo);
        return null;
    }

    @PostMapping("/financing-opera/acceptance-status")
    public ResponseEntity<String> addAcceptanceDetail() {
        log.debug("/financing-opera/acceptance-status : {}");
        return null;
    }

    @PostMapping("/financing-opera/post-disbursement-status")
    public ResponseEntity<String> addPostDisbursementDetail() {
        log.debug("/financing-opera/post-disbursement-status : {}");
        return null;
    }

    @GetMapping("/financing-opera/generate-doc/{appNo}")
    public ResponseEntity<?> generateDocument(@PathVariable("appNo") Long appNo, @RequestParam("docName") String docName) {
        log.debug("/financing-opera/generate-doc : {}, for {}", docName, appNo);

        // ResponseEntity<byte[]> generateStatementReport = reportsService.generateReport(appNo, docName);
        // byte[] body = generateStatementReport.getBody();
        // HttpHeaders headers = new HttpHeaders();
        // headers.setContentType(MediaType.APPLICATION_PDF);
        // headers.setContentDispositionFormData("attachment", docName);

        // InputStreamResource inputStreamResource = new InputStreamResource(new ByteArrayInputStream(body));

        return null;
    }

    @PostMapping("/financing-opera/export-to-file")
    public Callable<ResponseEntity<byte[]>> exportToExcelfile() throws IOException {
        log.debug("/financing-opera/export-to-file");
        return null;
    }

    @GetMapping("/financing-opera/sub-status/{status}")
    public List<String> findSubStatusByStatus(@PathVariable("status") String status) {
        log.debug("/financing-opera/sub-status/{status} : {}", status);
        return null;
    }

    @GetMapping("/financing-opera/acf-creation-details/{appNo}")
    public ResponseEntity<List<String>> getACFNumberCreationDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/acf-creation-details/{appNo} : {}", appNo);
        return null;
    }

    @GetMapping("/financing-opera/financing-doc-details/{appNo}")
    public ResponseEntity<List<String>> getFinancingDocumentDetails(@PathVariable("appNo") Long appNo) {
        log.debug("/financing-opera/financing-doc-details/{appNo} : {}", appNo);
        return null;
    }

}
