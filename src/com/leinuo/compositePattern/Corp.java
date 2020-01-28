package com.leinuo.compositePattern;

import com.sun.scenario.effect.Crop;

/**
 * Create by leinuo on 2020/1/28 下午5:57
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public  abstract class Corp {

    private String name ="";
    private String position="";
    private int salary=0;

    public Corp(String name,String position,int salary ){
        this.name=name;
        this.position=position;
        this.salary=salary;
    }

    public String getInfo() {
        return String.format("姓名：%s\t职位：%s\t薪水：%s",this.name,this.position,this.salary);
    }
}
