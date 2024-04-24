package com.qikgrocery.payment.domain;

import jakarta.persistence.Entity;

public class Promotion {
    private String id;
    private PromotionType type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PromotionType getType() {
        return type;
    }

    public void setType(PromotionType type) {
        this.type = type;
    }
}
