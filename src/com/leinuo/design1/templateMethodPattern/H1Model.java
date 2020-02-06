package com.leinuo.design1.templateMethodPattern;

/**
 * Create by leinuo on 20-1-16 下午3:33
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class H1Model extends HummerModel {

    private boolean alarmFalg = true;
    @Override
    public void start() {
        System.out.println("悍马H1...start");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1...stop");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1...alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1...engineBoom");
    }

    //默认没有喇叭的
    @Override
    protected boolean isAlarm() {
        return this.alarmFalg;
    }

    public void setAlarm(boolean isAlarm){
        this.alarmFalg = isAlarm;
    }

}
