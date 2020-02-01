package com.leinuo.statePattern;

import static com.leinuo.statePattern.State.STOPPING;

/**
 * Create by leinuo on 2020/2/1 下午5:40
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 状态模式
 */
public class Client {
    public static void main(String[] args) {
       /* ILift lift = new Lift();

        //电梯的初始条件应该是停止状态
        lift.setState(STOPPING);

        //首先是电梯门开启，人进去
        lift.open();

        //然后电梯门关闭
        lift.close();

        //再然后，电梯跑起来，向上或者向下
        lift.run();

        lift.stop();
*/

        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
