package com.leinuo.design1.decoratorPattern;

/**
 * Create by leinuo on 2020/1/17 下午4:33
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    //告诉老爸学校的排名情况
    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
