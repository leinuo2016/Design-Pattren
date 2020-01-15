package com.leinuo.abstractFactoryPattern;

/**
 * Create by leinuo on 20-1-14 上午11:30
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 抽象工厂方法模式
 */
public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleHumanFactory();

        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        HumanFactory gayHumanFactory = new GayHumanFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuamn();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuamn();

        Human gayWhiteHuman = gayHumanFactory.createWhiteHuamn();

        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        maleYellowHuman.sex();
        femaleYellowHuman.sex();
        gayWhiteHuman.sex();
    }
}
