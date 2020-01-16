package com.leinuo.facadePattern;

/**
 * Create by leinuo on 20-1-15 下午2:49
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 定义一个写信的过程
 */
public interface LetterProcess {
    //写信
    public void writeContext(String context);
    //写信封
    public void fillEnvelope(String address);
    //信装信封里
    public void letterIntoEnvelope();
    //投递
    public void sendLetter();
}
