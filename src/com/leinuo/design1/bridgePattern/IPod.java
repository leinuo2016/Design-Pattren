package com.leinuo.design1.bridgePattern;

/**
 * Create by leinuo on 2020/1/17 上午10:30
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class IPod extends Product {
    @Override
    public void beProduced() {
        System.out.println("做IPod");
    }

    @Override
    public void beSelled() {
        System.out.println("卖IPod");
    }
}
