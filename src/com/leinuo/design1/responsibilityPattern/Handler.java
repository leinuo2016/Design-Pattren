package com.leinuo.design1.responsibilityPattern;

/**
 * Create by leinuo on 2020/1/29 下午3:36
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public abstract class Handler {

    private int level=0;

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void HandleMerssage(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else {
            if (this.nextHandler != null) { //有后续环节，才把请求往后递送
                this.nextHandler.HandleMerssage(women);
            } else { //已经没有后续处理人了，不用处理了
                System.out.println("-----------没地方请示了，不做处理！---------\n");
            }
        }
    }

    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    //有请示那当然要回应
    public abstract void response(IWomen women);
}
