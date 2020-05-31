package com.miaoshaproject.service.model;


import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * @Author hly
 * @Date 2020/5/31 8:54
 * @Version 1.0
 */
public class PromoModel {

    private Integer id;

    //活动名称
    private String promoName;

    //活动开始时间
    private DateTime startDate;

    //活动适用商品
    private Integer itemId;

    //活动商品价格
    private BigDecimal promoItemPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPromoItemPrice() {
        return promoItemPrice;
    }

    public void setPromoItemPrice(BigDecimal promoItemPrice) {
        this.promoItemPrice = promoItemPrice;
    }
}
