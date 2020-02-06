package com.leinuo.design1.abstractFactoryPattern;

/**
 * Create by leinuo on 20-1-15 上午11:10
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class GayHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowHuamn() {
        return super.createHuman(HumanEnum.YelloGayHuman);
    }

    @Override
    public Human createWhiteHuamn() {
        return super.createHuman(HumanEnum.WhiteGayHuman);
    }

    @Override
    public Human createBlackHuamn() {
        return super.createHuman(HumanEnum.BlackGayHuman);
    }
}
