package com.leinuo.strategyPattern;

/**
 * Create by leinuo on 20-1-8 下午5:19
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Context {
    private IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void operate(){
        this.iStrategy.operate();
    }
}
