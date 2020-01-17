package com.leinuo.bridgePattern;

/**
 * Create by leinuo on 2020/1/17 上午10:13
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product=product;
    }

    protected abstract void produce();

    protected abstract void sell();

    public void makeMoney(){
        this.product.beProduced();
        this.product.beSelled();
    };


}
