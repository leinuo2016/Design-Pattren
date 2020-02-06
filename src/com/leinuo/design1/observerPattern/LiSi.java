package com.leinuo.design1.observerPattern;

/**
 * Create by leinuo on 2020/1/28 下午6:16
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
        this.reportToQiShiHuang(context);
        System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
    }

    //汇报给秦始皇
    private void reportToQiShiHuang(String reportContext){
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}
