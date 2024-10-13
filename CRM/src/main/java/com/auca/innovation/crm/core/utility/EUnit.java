package com.auca.innovation.crm.core.utility;

public enum EUnit {
    KG("kg"),
    G("g"),
    L("l"),
    M("m"),
    Piece("piece");
    private final String description;
    EUnit(String description) {
        this.description = description;
    }
}
