package com.leinuo.iteratorPattern;

import java.util.ArrayList;

/**
 * Create by leinuo on 2020/1/17 下午4:55
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 迭代器模式
 */
public class Boss {
    public static void main(String[] args) {
        /*ArrayList<IProject> projectList = new ArrayList<IProject>();

        //增加星球大战项目
        projectList.add(new Project("星球大战项目",10,100000));
        //增加扭转时空项目
        projectList.add(new Project("扭转时空项目",100,10000000));
        //增加超人改造项目
        projectList.add(new Project("超人改造项目",10000,1000000000));

        //遍历一下ArrayList，把所有的数据都取出
        for(IProject project:projectList){
            System.out.println(project.getProjectInfo());
        }
*/
        IProject project = new Project();
        project.add("星球大战项目",10,100000);
        //增加扭转时空项目
        project.add("扭转时空项目",100,10000000);
        //增加超人改造项目
        project.add("超人改造项目",10000,1000000000);

        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()){
            IProject p = (IProject)projectIterator.next();
            System.out.println(p.getProjectInfo());
        }

    }
}
