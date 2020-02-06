package com.leinuo.design1.responsibilityPattern;

/**
 * Create by leinuo on 2020/1/29 下午4:31
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Father extends Handler {


    public Father() {
        super(1);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
