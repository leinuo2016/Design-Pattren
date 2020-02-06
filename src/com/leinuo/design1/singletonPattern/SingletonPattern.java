package com.leinuo.design1.singletonPattern;

/**
 * Create by leinuo on 20-1-14 上午9:40
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class SingletonPattern {

    public static final SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern(){}

    private synchronized static SingletonPattern getInstance(){
        return singletonPattern;
    }
}
