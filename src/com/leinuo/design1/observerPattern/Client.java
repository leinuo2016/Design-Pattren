package com.leinuo.design1.observerPattern;

/**
 * Create by leinuo on 2020/1/28 下午6:22
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 * <p>
 * 观察者模式
 */
public class Client {

    public static void main(String[] args) {
        LiSi liSi = new LiSi();
        LiuSi liuSi = new LiuSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(liuSi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
        hanFeiZi.deleteObserver(liuSi);
        hanFeiZi.haveBreakfast();
    }
}
