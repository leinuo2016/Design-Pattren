package com.leinuo.abstractFactoryPattern;

/**
 * Create by leinuo on 20-1-15 上午10:45
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class MaleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowHuamn() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

    @Override
    public Human createWhiteHuamn() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    @Override
    public Human createBlackHuamn() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
