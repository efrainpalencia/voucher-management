package com.vouchermanagement.vouchermanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name="stores")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Store {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactNumber;
    private String category;

    @ManyToOne
    @JoinColumn(name="mall_id")
    private Mall mall;

    private Instant createdAt = Instant.now();

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<Voucher> vouchers;
}
