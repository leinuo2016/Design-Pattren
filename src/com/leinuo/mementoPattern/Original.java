package com.leinuo.mementoPattern;

/**
 * Create by leinuo on 2020/2/6 下午1:12
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Original {

    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
}
