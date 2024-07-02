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
public class ResponseDto implements Serializable {

    private static final long serialVersionUID = 5266096652073885910L;
    private String id;
    private String code;
    private String description;
    private String cbsCode;
    private Integer ordering;
}
