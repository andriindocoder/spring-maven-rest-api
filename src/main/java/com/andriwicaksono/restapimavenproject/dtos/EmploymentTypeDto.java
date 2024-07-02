/* Copyright 2023 */
package com.andriwicaksono.restapimavenproject.dtos;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmploymentTypeDto implements Serializable {

    private static final long serialVersionUID = -8773191230568758431L;
    private String id;
    private String code;
    private String description;
    private String cbsCode;
    private int ordering;
    private String requiredField;
    private String defaultOccupationId;
}
