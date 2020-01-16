package com.leinuo.builderPattern;

import java.util.ArrayList;

/**
 * Create by leinuo on 20-1-16 下午4:54
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public abstract class CarBuilder {

    //建造一个模型，你要给我一个顺序要，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
