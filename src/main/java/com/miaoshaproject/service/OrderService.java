package com.miaoshaproject.service;

import com.miaoshaproject.error.BussinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @Author hly
 * @Date 2020/5/29 8:43
 * @Version 1.0
 */
public interface OrderService {
    //1.通过前端上传过来的秒杀活动id,在下单接口内校验活动id是否对应 且活动已开始
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount) throws BussinessException;
}
