package com.leinuo.strategyPattern;

/**
 * Create by leinuo on 20-1-8 下午5:17
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行!!");
    }
}
