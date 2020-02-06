package com.leinuo.design1.statePattern;

/**
 * Create by leinuo on 2020/1/30 下午8:47
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public interface ILift {

    public void setState(State state);

    void open();
    void close();
    void run();
    void stop();
}
