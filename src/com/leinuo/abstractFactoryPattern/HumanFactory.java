package com.leinuo.abstractFactoryPattern;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Create by leinuo on 20-1-14 上午11:06
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public interface HumanFactory {

    //造黄种人
    public Human createYellowHuamn();
    //造白种人
    public Human createWhiteHuamn();
    //造黑种人
    public Human createBlackHuamn();

}
