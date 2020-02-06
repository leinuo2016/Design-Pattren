package com.leinuo.design1.commandPattern;

/**
 * Create by leinuo on 2020/1/17 下午12:03
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 命令模式
 */
public class Client {
    public static void main(String[] args) {
        Group group = new RequirementGroup();



        Invoker invoker = new Invoker();

        //客户要求增加一项需求
        System.out.println("---客户要求增加一项需求----");
        //客户给我们下命令来
        Command command = new AddRequirementCommand();

        //接头人接收到命令
        invoker.setCommand(command);

        //接头人执行命令
        invoker.action();

    }
}
