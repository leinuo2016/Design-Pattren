package com.leinuo.design1.statePattern;

/**
 * Create by leinuo on 2020/2/1 下午5:54
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.closeingState);
        //动作委托为CloseState来执行
        super.context.getLiftState().close();

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
