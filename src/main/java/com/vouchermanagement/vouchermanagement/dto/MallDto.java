package com.vouchermanagement.vouchermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MallDto {

    private Long id;
    private String name;
    private String address;
    private String city;
}
