package com.oscarjia.springbootmall.dto;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

public class CreateOrderRequest {

    // 僅運用於List與Map上
    @NotEmpty
    private List<BuyItem> buyItemList;

    public List<BuyItem> getBuyItemList() {
        return buyItemList;
    }

    public void setBuyItemList(List<BuyItem> buyItemList) {
        this.buyItemList = buyItemList;
    }
}
