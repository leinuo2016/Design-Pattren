package com.leinuo.visitorPattern;

/**
 * Create by leinuo on 2020/1/29 下午8:44
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Manager extends Employee {
    @Override
    public void accept(IVisitor visitor){
        visitor.visit(this);
    }


    //这类人物的职责非常明确：业绩
    private String performance;
    public String getPerformance() {
        return performance;
    }
    public void setPerformance(String performance) {
        this.performance = performance;
    }

}
