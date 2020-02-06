package com.leinuo.design1.templateMethodPattern;

/**
 * Create by leinuo on 20-1-16 下午3:33
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class H2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H2...start");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2...stop");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2...alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2...engineBoom");
    }
    protected boolean isAlarm(){
        return false;
    }
}
