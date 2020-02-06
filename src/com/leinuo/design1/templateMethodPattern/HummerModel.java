package com.leinuo.design1.templateMethodPattern;

/**
 * Create by leinuo on 20-1-16 下午3:30
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public abstract class HummerModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){
        //先发动汽车
        this.start();
        //引擎开始轰鸣
        this.engineBoom();
        //然后就开始跑了
        if(this.isAlarm()){
            this.alarm();
        }
        //到达目的地停车
        this.stop();
    };

    protected boolean isAlarm() {
        return true;
    }

}
