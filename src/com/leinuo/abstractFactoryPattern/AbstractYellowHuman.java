package com.leinuo.abstractFactoryPattern;

/**
 * Create by leinuo on 20-1-14 上午10:59
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public abstract class AbstractYellowHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黄色人种会笑！");
    }

    @Override
    public void cry() {
        System.out.println("黄色人种会哭了！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话！");
    }
}
