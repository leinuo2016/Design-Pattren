package com.leinuo.commandPattern;

/**
 * Create by leinuo on 2020/1/17 下午12:12
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public abstract class Command {

    //把三个组都定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup();

    protected PageGroup pg = new PageGroup();

    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();

}
