package com.leinuo.mementoPattern;

/**
 * Create by leinuo on 2020/2/6 下午1:46
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
