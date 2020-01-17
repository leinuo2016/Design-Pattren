package com.leinuo.bridgePattern;

/**
 * Create by leinuo on 2020/1/17 上午10:16
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class HouseCorp extends Corp {

    public HouseCorp(Product product){
        super(product);
    }

    @Override
    protected void produce() {
        System.out.println("盖楼房");
    }

    @Override
    protected void sell() {
        System.out.println("卖楼房");
    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("房产公司赚钱");
    }
}
