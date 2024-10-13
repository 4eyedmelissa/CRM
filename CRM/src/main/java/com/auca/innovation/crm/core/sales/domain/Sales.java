package com.auca.innovation.crm.core.sales.domain;

import com.auca.innovation.crm.core.customer.domain.Customer;
import com.auca.innovation.crm.core.productcategory.domain.ProductCategory;
import com.auca.innovation.crm.core.utility.AbstractBaseEntity;
import com.auca.innovation.crm.core.utility.ESalesStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Sales extends AbstractBaseEntity {
    @Column(name="status",nullable = false)
    @Enumerated(EnumType.STRING)
    private ESalesStatus status=ESalesStatus.INITIATED;

    @ManyToOne

    private Customer customer;

    @OneToMany
    @JoinColumn(name="product_ids", nullable=false)
    private List<ProductCategory> productCategories;

}
