package com.miaoshaproject.error;

/**
 * @Author hly
 * @Date 2020/5/8 16:30
 * @Version 1.0
 */
public interface CommonError {
    int getErrCode();
    String getErrMsg();
    CommonError setErrMsg(String errMsg);

}
