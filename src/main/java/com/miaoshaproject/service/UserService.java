package com.miaoshaproject.service;

import com.miaoshaproject.error.BussinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @author hly
 */
public interface UserService {
    //通过用户id获取对象的方法
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BussinessException;

    /*
    telphone: 用户手机
    password: 用户加密后密码
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BussinessException;
}
