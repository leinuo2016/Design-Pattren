package com.leinuo.design1.abstractFactoryPattern;

/**
 * Create by leinuo on 20-1-14 下午2:25
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class YellowMaleHuman  extends AbstractYellowHuman{
    @Override
    public void sex() {
        System.out.println("该黄种人的性别为男...");
    }
}
