package com.vouchermanagement.vouchermanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password; // Store encoded

    private String fullName;

    @Column(unique = true, nullable = false)
    @Email(message = "Invalid email address")
    private String email;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;
}
