package com.leinuo.design1.statePattern;

/**
 * Create by leinuo on 2020/2/1 下午5:58
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯上下跑...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); //环境设置为停止状态；
        super.context.getLiftState().stop();

    }
}
