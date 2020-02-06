package com.leinuo.design1.responsibilityPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * Create by leinuo on 2020/1/29 下午4:37
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 责任链模式
 */
public class Client {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(new Women(random.nextInt(4),"逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for(IWomen women:list){
            father.HandleMerssage(women);
        }

    }
}
