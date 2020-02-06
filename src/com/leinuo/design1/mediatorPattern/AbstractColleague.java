package com.leinuo.design1.mediatorPattern;

/**
 * Create by leinuo on 2020/2/4 下午1:35
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator mediator){
        this.mediator = mediator;
    }
}
