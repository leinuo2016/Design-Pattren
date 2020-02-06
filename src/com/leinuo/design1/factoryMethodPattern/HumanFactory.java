package com.leinuo.design1.factoryMethodPattern;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Create by leinuo on 20-1-14 上午11:06
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class HumanFactory {

    private static HashMap<String,Human> humanHashMap = new HashMap<>();

    public static Human createHuman(Class c){
        Human human = null;
        try {
            if(humanHashMap.containsKey(c.getSimpleName())){
                human = humanHashMap.get(c.getSimpleName());
            }else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humanHashMap.put(c.getSimpleName(),human);
            }
        } catch (InstantiationException e) {
            System.out.println("必须指定人种的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误！");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人种找不到！");
        }
        return human;
    }

    public static Human createHuman(){
        Human human = null;
        List<Class> concertHumanList = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        human = createHuman(concertHumanList.get(random.nextInt(concertHumanList.size())));
        return human;
    }
}
