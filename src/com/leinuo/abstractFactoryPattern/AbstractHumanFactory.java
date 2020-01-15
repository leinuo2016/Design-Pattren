package com.leinuo.abstractFactoryPattern;

/**
 * Create by leinuo on 20-1-15 上午10:42
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public abstract class AbstractHumanFactory implements HumanFactory {

    protected Human createHuman(HumanEnum humanEnum){
        Human human = null;

        try {
            human = (Human) Class.forName(humanEnum.getValue()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return human;
    }
}
