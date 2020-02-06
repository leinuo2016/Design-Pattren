package com.leinuo.design1.abstractFactoryPattern;


/**
 * Create by leinuo on 20-1-14 下午2:28
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class BlackFemaleHuman extends AbstractBlackHuman {
    @Override
    public void sex() {
        System.out.println("该黑种人的性别为女....");
    }
}
