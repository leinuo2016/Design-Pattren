package com.leinuo.compositePattern;

import java.util.ArrayList;

/**
 * Create by leinuo on 2020/1/25 下午10:09
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Branch extends Corp{

    ArrayList<Corp> subordinateList = new ArrayList<Corp>();

    public Branch(String name,String position,int salary){
      super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }

}
