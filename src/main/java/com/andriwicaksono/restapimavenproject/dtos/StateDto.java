/* Copyright 2023 */
package com.andriwicaksono.restapimavenproject.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StateDto {

    private String code;
    private String name;
    private String cbsCode;
}
