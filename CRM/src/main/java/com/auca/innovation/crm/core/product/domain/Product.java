package com.auca.innovation.crm.core.product.domain;

import com.auca.innovation.crm.core.productcategory.domain.ProductCategory;
import com.auca.innovation.crm.core.utility.AbstractBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter @Setter
public class Product extends AbstractBaseEntity {
    @Column(name="serial_number", nullable=false, unique=true)
    private String serialNumber;
    @ManyToMany
    @JoinTable(
            
    )
    private Set<ProductCategory> categories;


}
