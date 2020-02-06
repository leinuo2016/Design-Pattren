package com.leinuo.design1.visitorPattern;

/**
 * Create by leinuo on 2020/1/29 下午9:00
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public interface IVisitor {

    //首先定义我可以访问普通员工
    public void visit(CommonEmployee commonEmployee);
    //其次定义，我还可以访问部门经理
    public void visit(Manager manager);

}
