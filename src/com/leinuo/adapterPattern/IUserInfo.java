package com.leinuo.adapterPattern;

/**
 * Create by leinuo on 20-1-16 下午2:42
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public interface IUserInfo {
    //获得用户姓名
    public String getUserName();
    //获得家庭地址
    public String getHomeAddress();
    //手机号码，这个太重要，手机泛滥呀
    public String getMobileNumber();
    //办公电话，一般式座机
    public String getOfficeTelNumber();
    //这个人的职位是啥
    public String getJobPosition();
    //获得家庭电话，这个有点缺德，我是不喜欢打家庭
    public String getHomeTelNumber();
}
