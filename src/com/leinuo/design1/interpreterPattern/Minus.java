package com.leinuo.design1.interpreterPattern;

/**
 * Create by leinuo on 2020/2/6 下午12:05
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
