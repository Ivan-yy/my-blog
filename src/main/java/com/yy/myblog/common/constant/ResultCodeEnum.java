package com.yy.myblog.common.constant;

public enum ResultCodeEnum {
    CODE_500("500"),
    CODE_200("200");
    String code;
    ResultCodeEnum(String code){
        this.code = code;
    }

    public String code(){
        return code;
    }
}
