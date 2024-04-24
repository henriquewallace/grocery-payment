package com.qikgrocery.payment.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionBuyGetFree implements Promotion {

    private String id;
    private PromotionType type;
    private Integer requiredQty;
    private Integer freeQty;

    public PromotionBuyGetFree(String id, PromotionType type, Integer requiredQty, Integer freeQty) {
        this.id = id;
        this.type = type;
        this.requiredQty = requiredQty;
        this.freeQty = freeQty;
    }

    @Override
    public void applyPromotion() {

    }
}
