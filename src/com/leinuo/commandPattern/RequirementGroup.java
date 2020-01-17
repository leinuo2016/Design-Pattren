package com.leinuo.commandPattern;

/**
 * Create by leinuo on 2020/1/17 上午11:56
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class RequirementGroup extends Group {
    @Override
    public void add() {
        System.out.println("客户要求增加一条需求...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一条需求...");
    }

    @Override
    public void change() {
        System.out.println("客户要求改变一条需求...");
    }

    @Override
    public void find() {
        System.out.println("客户找到需求组...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求需求变更计划...");
    }
}
