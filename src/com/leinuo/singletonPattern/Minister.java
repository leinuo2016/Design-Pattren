package com.leinuo.singletonPattern;

/**
 * Create by leinuo on 20-1-14 上午9:36
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 *单例模式
 */
public class Minister {

    public static void main(String[] args) {
        Emperor emperor = Emperor.getInstance();
        emperor.emperorInfo();
    }
}
