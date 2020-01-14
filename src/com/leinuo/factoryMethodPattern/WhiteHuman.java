package com.leinuo.factoryMethodPattern;

/**
 * Create by leinuo on 20-1-14 上午11:02
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class WhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白人种会。。。笑！");
    }

    @Override
    public void cry() {
        System.out.println("白人种会。。。哭了！");
    }

    @Override
    public void talk() {
        System.out.println("白人种会说。。。话！");
    }
}
