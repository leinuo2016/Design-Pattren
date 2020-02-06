package com.leinuo.design1.decoratorPattern;

/**
 * Create by leinuo on 2020/1/17 下午4:16
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class FouthGradSchoolReport extends SchoolReport {
    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");

    }

    @Override
    public void sign(String name) {
        System.out.println(" 家长签名： "+name);
    }
}
