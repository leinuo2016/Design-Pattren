package com.leinuo.design1.statePattern;

/**
 * Create by leinuo on 2020/2/1 下午5:59
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();

    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
