package com.leinuo.design1.decoratorPattern;

/**
 * Create by leinuo on 2020/1/17 下午4:19
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 装饰模式
 */
public class Father {
    public static void main(String[] args) {
        FouthGradSchoolReport fouthGradSchoolReport = new FouthGradSchoolReport();

        fouthGradSchoolReport.report();


        SchoolReport sr;
        sr = new FouthGradSchoolReport();

        sr = new HighScoreDecorator(sr);

        sr = new SortDecorator(sr);

        sr.report();

        sr.sign("家长");
    }
}
