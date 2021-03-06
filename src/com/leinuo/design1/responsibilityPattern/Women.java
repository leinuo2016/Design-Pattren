package com.leinuo.design1.responsibilityPattern;

/**
 * Create by leinuo on 2020/1/29 下午4:34
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Women implements IWomen {

    private int type=0;

    private String request;

    public Women(int type, String request) {
        this.type = type;
        switch (this.type){
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
        }
        this.request = request;
    }
    //获得自己的状况
    public int getType(){
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
