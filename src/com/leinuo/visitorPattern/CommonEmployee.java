package com.leinuo.visitorPattern;

/**
 * Create by leinuo on 2020/1/29 下午8:43
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class CommonEmployee extends Employee {

    private String job;
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }


}
