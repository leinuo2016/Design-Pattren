package com.leinuo.commandPattern;

/**
 * Create by leinuo on 2020/1/17 下午12:01
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class CodeGroup extends Group{
    @Override
    public void add() {
        System.out.println("客户要求增加一项功能...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项功能...");
    }

    @Override
    public void change() {
        System.out.println("客户要求改变一项功能...");
    }

    @Override
    public void find() {
        System.out.println("客户找到代码组...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划...");
    }
}
