package com.leinuo.design1.iteratorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Create by leinuo on 2020/1/20 下午8:23
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class ProjectIterator implements IProjectIterator {

    private List<Project> list = new ArrayList<>();

    private int currentItem=0;

    public ProjectIterator(List<Project> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        boolean flag = true;
        if(this.currentItem>=list.size()|| Objects.isNull(this.list.get(this.currentItem))){
            flag=false;
        }
        return flag;
    }

    @Override
    public IProject next() {
        return this.list.get(currentItem++);
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
