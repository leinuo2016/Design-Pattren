package com.leinuo.design1.prototypePattern;

/**
 * Create by leinuo on 2020/2/3 下午12:20
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Mail implements Cloneable{


    //收件人
    private String receiver;
    //邮件名称
    private String subject;

    //称谓
    private String appellation;

    //邮件内容
    private String contxt;

    //邮件的尾部，一般都是加上“XXX版权所有”等信息
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    public Mail clone(){
        Mail mail =null;
        try {
            mail = (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContxt() {
        return contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
