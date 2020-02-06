package com.leinuo.design1.mediatorPattern;

/**
 * Create by leinuo on 2020/2/4 上午11:56
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy", number);
    }
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
