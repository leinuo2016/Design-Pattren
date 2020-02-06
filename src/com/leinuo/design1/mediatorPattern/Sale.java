package com.leinuo.design1.mediatorPattern;

import java.util.Random;

/**
 * Create by leinuo on 2020/2/4 下午12:34
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Sale extends AbstractColleague{
    public Sale(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }
    //销售IBM型号的电脑
    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑"+number+"台");
    }
    //反馈销售情况,0——100之间变化，0代表根本就没人卖，100代表非常畅销，出一个卖一个
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }
    //折价处理
    public void offSale(){
        //库房有多少卖多少
        super.mediator.execute("sale.offsell");
    }
}
