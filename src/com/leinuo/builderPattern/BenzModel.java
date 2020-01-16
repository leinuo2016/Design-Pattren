package com.leinuo.builderPattern;

import com.leinuo.templateMethodPattern.HummerModel;

/**
 * Create by leinuo on 20-1-16 下午3:33
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class BenzModel extends CarModel {

    private boolean alarmFalg = true;
    @Override
    public void start() {
        System.out.println("BenzModel...start");
    }

    @Override
    public void stop() {
        System.out.println("BenzModel...stop");
    }

    @Override
    public void alarm() {
        System.out.println("BenzModel...alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("BenzModel...engineBoom");
    }


    public void setAlarm(boolean isAlarm){
        this.alarmFalg = isAlarm;
    }

}
