package com.leinuo.design1.visitorPattern;

/**
 * Create by leinuo on 2020/1/29 下午9:34
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public interface ITotalVisitor extends IVisitor {

    //统计所有员工工资总和
    public void totalSalary();
}
