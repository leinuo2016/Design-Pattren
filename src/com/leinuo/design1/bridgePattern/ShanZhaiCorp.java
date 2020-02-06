package com.leinuo.design1.bridgePattern;

/**
 * Create by leinuo on 2020/1/17 上午10:28
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class ShanZhaiCorp extends Corp {

    public ShanZhaiCorp(Product product){
        super(product);
    }

    @Override
    protected void produce() {
        System.out.println("做衣服");
    }

    @Override
    protected void sell() {
        System.out.println("卖衣服");
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("山寨公司赚钱");
    }

}
