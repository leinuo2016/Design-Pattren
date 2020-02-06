package com.leinuo.design1.mementoPattern;

/**
 * Create by leinuo on 2020/2/6 下午1:44
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
