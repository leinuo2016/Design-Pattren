package com.leinuo.factoryMethodPattern;

/**
 * Create by leinuo on 20-1-14 上午11:04
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class BlackHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黑人种会笑；；！");
    }

    @Override
    public void cry() {
        System.out.println("黑人种会哭了；；！");
    }

    @Override
    public void talk() {
        System.out.println("黑人种会说话；；！");
    }
}
