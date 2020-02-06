package com.leinuo.design1.visitorPattern;

/**
 * Create by leinuo on 2020/1/29 下午9:35
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class ShowVisitor implements IShowVisitor {
    private String info = "";


    @Override
    public void report() {
        System.out.println(this.info);
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info =this.info + getCommonEmployee(commonEmployee)+"\n";
    }

    @Override
    public void visit(Manager manager) {
        this.info = this.info + getManagerInfo(manager)+"\n";
    }

    private String getBasicInfo(Employee employee){
        String info = String.format("姓名：%s,性别：%s,薪水：%s",employee.getName(),(employee.getSex() == 1?"女":"男"),employee.getSalary());
        return info;
    }

    //组装出部门经理的信息
    private String getManagerInfo(Manager manager) {
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return this.getBasicInfo(manager)+otherInfo;
    }

    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee commonEmployee){
        String otherInfo = "工作："+commonEmployee.getJob()+"\t";
        return this.getBasicInfo(commonEmployee) + otherInfo;
    }
}
