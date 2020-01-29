package com.leinuo.responsibilityPattern;

/**
 * Create by leinuo on 2020/1/29 下午4:31
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Son extends Handler {


    public Son() {
        super(3);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}
