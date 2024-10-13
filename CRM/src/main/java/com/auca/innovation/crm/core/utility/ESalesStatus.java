package com.auca.innovation.crm.core.utility;

public enum ESalesStatus {
    INITIATED ("Initiated"),
    PROCESSED ("Processed"),
    PAID("Paid"),
    RETURN("Return");
    private final String description;
    ESalesStatus(String description) {
        this.description = description;
    }
}
