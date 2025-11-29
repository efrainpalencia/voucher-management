package com.vouchermanagement.vouchermanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Voucher {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(length = 1000)
    private String description;
    private String code;
    private String discountPercentage;
    private LocalDate validFrom;
    private LocalDate validTo;
    private Boolean active = true;

    @ManyToOne
    @JoinColumn(name="store_id")
    private Store store;
}
