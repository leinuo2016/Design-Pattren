package com.leinuo.design1.decoratorPattern;

/**
 * Create by leinuo on 2020/1/17 下午4:29
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Decorator extends SchoolReport {

    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport){
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
