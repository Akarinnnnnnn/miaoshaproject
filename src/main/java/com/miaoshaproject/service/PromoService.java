package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @Author hly
 * @Date 2020/6/1 7:58
 * @Version 1.0
 */
public interface PromoService {
    //根据itemid获取即将进行的或正在进行的活动
    PromoModel getPromoByItemId(Integer itemId);
}
