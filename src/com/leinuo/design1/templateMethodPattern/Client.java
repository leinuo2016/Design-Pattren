package com.leinuo.design1.templateMethodPattern;

/**
 * Create by leinuo on 20-1-16 下午3:41
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 模板方法模式
 */
public class Client {
    public static void main(String[] args) {
        H1Model h1 = new H1Model();
        h1.setAlarm(true);
        h1.run();
        HummerModel h2 = new H2Model();
        h2.run();
    }
}
