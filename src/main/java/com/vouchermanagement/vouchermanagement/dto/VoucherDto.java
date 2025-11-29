package com.vouchermanagement.vouchermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VoucherDto {

    private Long id;
    private String title;
    private String description;
    private String code;
    private String discountPercentage;
    private String validFrom;
    private String validTo;
    private Boolean active;
    private Long storeId;
}
