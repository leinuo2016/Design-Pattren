package com.leinuo.decoratorPattern;

/**
 * Create by leinuo on 2020/1/17 下午4:31
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    //我要汇报最高成绩
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
