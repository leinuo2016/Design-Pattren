package com.leinuo.design1.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by leinuo on 2020/1/17 下午4:56
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Project implements IProject {
    private List<Project> list = new ArrayList<>();

    //项目名称
    private String name = "";
    //项目成员数量
    private int num = 0;
    //项目费用
    private int cost = 0;

    public Project(){}

    private Project(String name,int num,int cost){
        this.name=name;
        this.num=num;
        this.cost=cost;
    }
    @Override
    public String getProjectInfo() {
        return String.format("项目名称：%s,项目人数：%s,项目费用：%s",this.name,this.num,this.cost);
    }

    @Override
    public void add(String name, int num, int cost) {
        this.list.add(new Project(name,num,cost));
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.list);
    }
}
