package com.leinuo.design1.factoryMethodPattern;

/**
 * Create by leinuo on 20-1-14 上午11:30
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 工厂方法模式
 */
public class NvWa {

    public static void main(String[] args) {
        System.out.println("女娲造白人");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.laugh();
        whiteHuman.cry();
        whiteHuman.talk();

        System.out.println("女娲造黑人");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.laugh();
        blackHuman.cry();
        blackHuman.talk();

        System.out.println("女娲造黄人");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.laugh();
        yellowHuman.cry();
        yellowHuman.talk();

        System.out.println("女娲随机造人");
        Human human;
        for(int i=0;i<100;i++){
            human = HumanFactory.createHuman();
            human.laugh();
            human.cry();
            human.talk();
        }

    }
}
