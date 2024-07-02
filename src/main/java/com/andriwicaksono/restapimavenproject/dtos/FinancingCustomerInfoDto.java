/* Copyright 2023 */
package com.andriwicaksono.restapimavenproject.dtos;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FinancingCustomerInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<ResponseDto> races;
    private List<ResponseDto> religions;
    private List<ResponseDto> employmentSectors;
    private List<ResponseDto> residentialTypes;
    private List<ResponseDto> workExperiences;
    private List<EmploymentTypeDto> employmentTypes;
    private List<ResponseDto> contactPersonRelation;
    private List<String> anysideincome;
    private List<ResponseDto> educationLevels;
    private List<ResponseDto> reasonsForFinancing;
    private List<String> anyRelationWithBank;
    // private List<StateDto> states;
    private List<ResponseDto> employments;
    private List<ResponseDto> otherCommitments;
    private List<ResponseDto> staffRelationships;
    private List<ResponseDto> personType;
    private List<ResponseDto> maritalStatuses;
    private List<ResponseDto> sideIncomeCategories;
}
