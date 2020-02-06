package com.leinuo.design1.statePattern;

/**
 * Create by leinuo on 2020/1/30 下午8:48
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Lift implements ILift {
    private State state;

    @Override
    public void setState(State state) {
      this.state =state;
    }

    @Override
    public void open() {
        //电梯在什么状态下才能关闭
        switch(this.state){
            case OPENING: //如果是则可以关门，同时修改电梯状态
                break;
            case CLOSING: //如果电梯就是关门状态，则什么都不做
                this.openWithoutLogic();
                this.setState(State.OPENING);
                break;
            case RUNNING: //如果是正在运行，门本来就是关闭的，也说明都不做
                //do nothing;
                break;
            case STOPPING: //如果是停止状态，本也是关闭的，什么也不做
                this.openWithoutLogic();
                this.setState(State.OPENING);
                break;
        }
    }

    @Override
    public void close() {
        //电梯在什么状态下才能关闭
        switch(this.state){
            case OPENING: //如果是则可以关门，同时修改电梯状态
                this.closeWithoutLogic();
                this.setState(State.CLOSING);
                break;
            case CLOSING: //如果电梯就是关门状态，则什么都不做
                //do nothing;
                break;
            case RUNNING: //如果是正在运行，门本来就是关闭的，也说明都不做
                //do nothing;
                break;
            case STOPPING: //如果是停止状态，本也是关闭的，什么也不做
                //do nothing;
                break;
        }
    }

    @Override
    public void run() {
        switch(this.state){
            case OPENING:
                break;
            case CLOSING:
                 this.runWithoutLogic();
                 this.setState(State.RUNNING);
            break;
            case RUNNING:
                break;
            case STOPPING:
                 this.runWithoutLogic();
                 this.setState(State.RUNNING);
        }
    }

    @Override
    public void stop() {
        switch(this.state) {
            case OPENING: //如果已经在门敞状态，那肯定要先停下来的，什么都不做
                //do nothing;
                break;
            case CLOSING: //如是电梯时关闭状态，则当然可以停止了
                this.stopWithoutLogic();
                this.setState(State.CLOSING);
                break;
            case RUNNING: //正在运行状态，有运行当然那也就有停止了
                this.stopWithoutLogic();
                this.setState(State.CLOSING);
                break;
            case STOPPING: //停止状态，什么都不做
                //do nothing;
                break;
        }
        }

    //纯粹的电梯关门，不考虑实际的逻辑
    private void closeWithoutLogic(){
        System.out.println("电梯门关闭...");
    }

    private void openWithoutLogic(){
        System.out.println("电梯门开启...");
    }
    //纯粹的运行，不考虑其他条件
    private void runWithoutLogic(){
        System.out.println("电梯上下跑起来...");
    }
    //单纯的停止，不考虑其他条件
    private void stopWithoutLogic(){
        System.out.println("电梯停止了...");
    }


}
