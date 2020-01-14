package com.leinuo.strategyPattern;

/**
 * Create by leinuo on 20-1-8 下午5:22
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 锦囊妙计的策略模式实现
 */
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;
        context = new Context(new BackDoor());
        context.operate();

        context = new Context(new GivenGreenLight());
        context.operate();

        context = new Context(new BlockEnemy());
        context.operate();
    }
}
