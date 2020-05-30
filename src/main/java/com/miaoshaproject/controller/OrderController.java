package com.miaoshaproject.controller;

import com.miaoshaproject.error.BussinessException;
import com.miaoshaproject.error.EmBusinessError;
import com.miaoshaproject.response.CommonReturnType;
import com.miaoshaproject.service.OrderService;
import com.miaoshaproject.service.model.OrderModel;
import com.miaoshaproject.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author hly
 * @Date 2020/5/30 18:58
 * @Version 1.0
 */
@Controller("order")
@RequestMapping("/order")
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"}) //允许前端进行跨域请求
public class OrderController extends BaseController{
    @Autowired
    private OrderService orderService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    //封装下单请求
    @RequestMapping(value = "/createorder", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    public CommonReturnType createOrder(@RequestParam(name = "itemId")Integer itemId,
                                        @RequestParam(name = "amount")Integer amount) throws BussinessException {
        Boolean isLogin = (Boolean) httpServletRequest.getSession().getAttribute("IS_LOGIN");
        if (isLogin == null || !isLogin.booleanValue()) {
            throw new BussinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, "用户还未登录, 不能下单");
        }
        //获取用户的登录信息
        UserModel userModel = (UserModel) httpServletRequest.getSession().getAttribute("LOGIN_USER");


        OrderModel orderModel = orderService.createOrder(userModel.getId(), itemId, amount);

        return CommonReturnType.create(null);
    }
}