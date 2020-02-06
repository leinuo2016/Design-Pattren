package com.leinuo.design1.bridgePattern;

/**
 * Create by leinuo on 2020/1/17 上午10:19
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class ClothesCorp extends Corp {

    public ClothesCorp(Product product){
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
        System.out.println("服装公司赚钱");
    }

}
