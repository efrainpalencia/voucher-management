package com.vouchermanagement.vouchermanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name="malls")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String city;

    private Instant createdAt = Instant.now();

    @OneToMany(mappedBy = "mall", cascade = CascadeType.ALL)
    private List<Store> stores;
}
