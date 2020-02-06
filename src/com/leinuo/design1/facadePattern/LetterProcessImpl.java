package com.leinuo.design1.facadePattern;

/**
 * Create by leinuo on 20-1-15 下午2:53
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容...." + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("收件人地址...."+address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("装信封....");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件....");
    }
}
