package com.leinuo.facadePattern;

/**
 * Create by leinuo on 20-1-15 下午2:56
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 门面模式
 */
public class Client {
    public static void main(String[] args) {
//        LetterProcess letterProcess = new LetterProcessImpl();
//        letterProcess.writeContext("hello world!");
//        letterProcess.fillEnvelope("地球村代号6收");
//        letterProcess.letterIntoEnvelope();
//        letterProcess.sendLetter();

        ModenPostOffice modenPostOffice = new ModenPostOffice();
        String content="hello world";
        String address="地球村代号6收";
        modenPostOffice.sendLetter(content,address);
    }
}
