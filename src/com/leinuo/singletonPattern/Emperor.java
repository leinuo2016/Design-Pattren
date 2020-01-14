package com.leinuo.singletonPattern;

import java.util.Objects;

/**
 * Create by leinuo on 20-1-14 上午9:32
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 单例模式
 */
public class Emperor {
    private  static Emperor emperor = null;

    private Emperor(){

    }

    public static Emperor getInstance(){
        if(Objects.isNull(emperor)){
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("emperor..");
    }

}
