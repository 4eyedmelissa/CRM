package com.auca.innovation.crm.core.productcategory.domain;

import com.auca.innovation.crm.core.utility.EUnit;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class ProductCategory {
    @Column(name="productCategoryName", nullable = false, unique = true)
    private String productCategoryName;
    @Column(name="unitPrice", nullable = false)
    private BigDecimal unitPrice;
    @Column(name="quantity", nullable = false)
    private BigDecimal quantity=BigDecimal.ZERO;
    @Column(name="unit", nullable = false)
    @Enumerated(EnumType.STRING)
    private EUnit unit;
}
