package com.leinuo.design1.abstractFactoryPattern;

/**
 * Create by leinuo on 20-1-14 下午2:31
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public enum HumanEnum {

    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.leinuo.abstractFactoryPattern.YellowMaleHuman"),
    YelloFemaleHuman("com.leinuo.abstractFactoryPattern.YellowFemaleHuman"),
    YelloGayHuman("com.leinuo.abstractFactoryPattern.YellowGayHuman"),

    WhiteFemaleHuman("com.leinuo.abstractFactoryPattern.WhiteFemaleHuman"),
    WhiteMaleHuman("com.leinuo.abstractFactoryPattern.WhiteMaleHuman"),
    WhiteGayHuman("com.leinuo.abstractFactoryPattern.WhiteGayHuman"),

    BlackFemaleHuman("com.leinuo.abstractFactoryPattern.BlackFemaleHuman"),
    BlackMaleHuman("com.leinuo.abstractFactoryPattern.BlackMaleHuman"),
    BlackGayHuman("com.leinuo.abstractFactoryPattern.BlackGayHuman");
    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
