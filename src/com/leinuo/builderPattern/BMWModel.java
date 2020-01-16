package com.leinuo.builderPattern;

import com.leinuo.templateMethodPattern.HummerModel;

/**
 * Create by leinuo on 20-1-16 下午3:33
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class BMWModel extends CarModel {
    @Override
    public void start() {
        System.out.println("BMWModel...start");
    }

    @Override
    public void stop() {
        System.out.println("BMWModel...stop");
    }

    @Override
    public void alarm() {
        System.out.println("BMWModel...alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("BMWModel...engineBoom");
    }

}
