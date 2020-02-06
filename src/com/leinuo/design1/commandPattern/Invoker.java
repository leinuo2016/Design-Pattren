package com.leinuo.design1.commandPattern;

/**
 * Create by leinuo on 2020/1/17 下午12:16
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
