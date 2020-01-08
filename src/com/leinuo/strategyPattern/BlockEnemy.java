package com.leinuo.strategyPattern;

/**
 * Create by leinuo on 20-1-8 下午5:18
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后,挡住追兵");
    }
}
