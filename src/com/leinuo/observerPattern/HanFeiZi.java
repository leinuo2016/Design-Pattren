package com.leinuo.observerPattern;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Create by leinuo on 2020/1/28 下午6:14
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class HanFeiZi implements Observable {

    //把李斯声明出来
    private Set<Observer> observers = new HashSet<>();


    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for(Observer observer:observers){
            observer.update(context);
        }
    }

    //韩非子开始吃饭了,古代人没啥娱乐，你能想到的就那么多
    public void haveBreakfast(){
        this.notifyObservers("韩非子在吃饭");
    }


    //韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
    public void haveFun(){
        this.notifyObservers("韩非子在娱乐");
    }




}
