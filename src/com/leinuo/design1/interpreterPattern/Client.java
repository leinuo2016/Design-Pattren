package com.leinuo.design1.interpreterPattern;

/**
 * Create by leinuo on 2020/2/6 下午12:06
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 *  解释器模式
 */
public class Client {

    public static void main(String[] args) {
        int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9,2)),8));
        System.out.printf("result:" +result);
    }
}
