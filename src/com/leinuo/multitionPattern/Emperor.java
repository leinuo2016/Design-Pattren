package com.leinuo.multitionPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * Create by leinuo on 20-1-14 上午9:49
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 多例模式
 */
public class Emperor {
    private static final int maxNumOfEmperor = 2;

    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);

    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);

    private static int countNumOfEmperor=0;

    static {
        for (int i=0;i<maxNumOfEmperor;i++){
            emperorList.add(new Emperor("第"+(i+1)+"个皇帝"));
        }
        emperorList.add(new Emperor("假皇帝"));
    }

    private Emperor(){}

    private Emperor(String info){
        emperorInfoList.add(info);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    public static Emperor getInstance(int num){
        if(num>=maxNumOfEmperor){
             Emperor emperor = (Emperor) emperorList.get(emperorList.size()-1);
             return emperor;
        }
        return (Emperor) emperorList.get(num);
    }

    public static void emperorInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }

    public static void emperorInfo(int num){
        if(num>=maxNumOfEmperor){
            System.out.println(emperorInfoList.get(emperorInfoList.size()-1));
            return;
        }
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }

}
