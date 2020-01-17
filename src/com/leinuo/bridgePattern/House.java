package com.leinuo.bridgePattern;

/**
 * Create by leinuo on 2020/1/17 上午10:29
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class House extends Product {
    @Override
    public void beProduced() {
        System.out.println("盖楼房");
    }

    @Override
    public void beSelled() {
        System.out.println("卖楼房");
    }
}
