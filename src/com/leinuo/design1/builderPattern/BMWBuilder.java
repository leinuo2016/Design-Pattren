package com.leinuo.design1.builderPattern;

import java.util.ArrayList;

/**
 * Create by leinuo on 20-1-16 下午4:57
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmw;
    }
}
