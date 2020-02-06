package com.leinuo.design1.abstractFactoryPattern;

/**
 * Create by leinuo on 20-1-14 下午2:24
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class WhiteMaleHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("该白种人的性别为男...");
    }
}
