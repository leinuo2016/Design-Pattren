package com.leinuo.proxyPattern;

/**
 * Create by leinuo on 20-1-9 下午5:38
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 戏说代理模式
 */
public class XiMenQing {

    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.happyWithMan();
        wangPo.makeEyesWithMan();

        Jiashi jiashi = new Jiashi();
        WangPo wangPo1 = new WangPo(jiashi);
        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }
}
