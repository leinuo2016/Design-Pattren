package com.leinuo.design1.mediatorPattern;

/**
 * Create by leinuo on 2020/2/4 下午1:10
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public abstract class AbstractMediator {

    protected Purchase purchase;

    protected Sale sale;

    protected Stock stock ;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String string, Object...objects);
}
