package com.leinuo.design1.mediatorPattern;

/**
 * Create by leinuo on 2020/2/4 下午12:33
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Stock extends AbstractColleague{
    //刚开始有100台电脑
    private static int COMPUTER_NUMBER =100;

    public Stock(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //库存增加
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }

    //库存降低
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }

    //获得库存数量
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    //存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售
    public void clearStock(){
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");

    }
}
