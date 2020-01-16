package com.leinuo.builderPattern;

import java.util.ArrayList;

/**
 * Create by leinuo on 20-1-16 下午4:34
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public abstract class CarModel {

    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();


    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){
        for(int i=0;i<sequence.size();i++){
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            }
            if(actionName.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }
            if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }
            if(actionName.equalsIgnoreCase("stop")){
                this.stop();
            }
        }
    };

    final public void setSequence(ArrayList sequence){
        this.sequence = sequence;
    };


}
