package com.leinuo.iteratorPattern;

/**
 * Create by leinuo on 2020/1/17 下午4:56
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 迭代器模式
 */
public interface IProject {

    public String getProjectInfo();

    public void add(String name,int num,int cost);

    public IProjectIterator iterator();
}
