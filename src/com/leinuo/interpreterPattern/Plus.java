package com.leinuo.interpreterPattern;

/**
 * Create by leinuo on 2020/2/6 下午12:01
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Plus implements Expression{
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
