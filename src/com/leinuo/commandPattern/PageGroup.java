package com.leinuo.commandPattern;

/**
 * Create by leinuo on 2020/1/17 上午11:59
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class PageGroup extends Group{

    @Override
    public void add() {
        System.out.println("客户要求增加一个页面...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面...");
    }

    @Override
    public void change() {
        System.out.println("客户要求改变一个页面...");
    }

    @Override
    public void find() {
        System.out.println("客户找到美工组...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求美工页面变更计划...");
    }
}
