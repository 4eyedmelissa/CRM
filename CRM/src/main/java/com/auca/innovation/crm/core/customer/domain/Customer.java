package com.auca.innovation.crm.core.customer.domain;

import com.auca.innovation.crm.core.utility.AbstractBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Entity
@Getter @Setter
public class Customer extends AbstractBaseEntity {
    @Column(name="firstName",nullable = false)
    private String firstName;
    @Column(name="lastName", nullable = false)
    private String lastName;
    @Column(name="email", nullable = false, unique = true)
    private String email;
    @Column(name="phoneNumber", nullable = false, unique = true)
    private String phoneNumber;





}
