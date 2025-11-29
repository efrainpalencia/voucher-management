package com.vouchermanagement.vouchermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreDto {

    private Long id;
    private String name;
    private String contactNumber;
    private String category;
    private Long mallId;
}
