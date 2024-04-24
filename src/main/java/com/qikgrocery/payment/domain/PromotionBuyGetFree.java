package com.qikgrocery.payment.domain;

public class PromotionBasedPrice extends Promotion {

    private Integer requiredQty;
    private Integer price;

    public PromotionBasedPrice(String id, PromotionType type) {
        super(id, type);
    }
}
