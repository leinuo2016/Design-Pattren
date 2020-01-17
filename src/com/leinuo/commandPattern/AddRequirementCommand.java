package com.leinuo.commandPattern;

/**
 * Create by leinuo on 2020/1/17 下午12:14
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();//增加一份需求
        super.rg.add();
        super.pg.add();
        super.cg.add();
        //给出计划
        super.rg.plan();
    }
}
