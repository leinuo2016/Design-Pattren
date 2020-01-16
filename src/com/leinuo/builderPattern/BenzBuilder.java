package com.leinuo.builderPattern;

import java.util.ArrayList;

/**
 * Create by leinuo on 20-1-16 下午4:55
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benz;
    }
}
