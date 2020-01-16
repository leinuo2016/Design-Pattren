package com.leinuo.adapterPattern;

import java.util.Map;

/**
 * Create by leinuo on 20-1-16 下午2:46
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public interface IOuterUser {

    //基本信息，比如名称，性别，手机号码了等
    public Map getUserBaseInfo();
    //工作区域信息
    public Map getUserOfficeInfo();
    //用户的家庭信息
    public Map getUserHomeInfo();


}
