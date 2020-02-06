package com.leinuo.design1.observerPattern;

/**
 * Create by leinuo on 2020/1/28 下午6:40
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public interface Observable {

    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObservers(String context);

}
