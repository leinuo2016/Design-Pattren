package com.leinuo.design1.facadePattern;

/**
 * Create by leinuo on 20-1-15 下午3:01
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();

    //写信，封装，投递，一体化了

    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
