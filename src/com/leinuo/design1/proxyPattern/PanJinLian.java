package com.leinuo.design1.proxyPattern;

/**
 * Create by leinuo on 20-1-9 下午5:35
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class PanJinLian implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("PanJinLian makeEyesWithMan");
    }

    @Override
    public void happyWithMan() {
        System.out.println("PanJinLian happyWithMan");
    }
}
