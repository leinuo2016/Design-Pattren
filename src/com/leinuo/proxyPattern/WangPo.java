package com.leinuo.proxyPattern;

/**
 * Create by leinuo on 20-1-9 下午5:36
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class WangPo implements KindWomen{

    private KindWomen kindWomen;

    public WangPo(){
        this.kindWomen = new PanJinLian();
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
