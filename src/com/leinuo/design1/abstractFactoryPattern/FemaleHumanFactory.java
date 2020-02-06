package com.leinuo.design1.abstractFactoryPattern;

/**
 * Create by leinuo on 20-1-15 上午10:47
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class FemaleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowHuamn() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }

    @Override
    public Human createWhiteHuamn() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    @Override
    public Human createBlackHuamn() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
