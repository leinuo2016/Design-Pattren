package com.leinuo.adapterPattern;

/**
 * Create by leinuo on 20-1-16 下午2:43
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 适配器模式
 */
public class App {
    public static void main(String[] args) {
        IUserInfo iUserInfo = new UserInfo();
        IUserInfo youngGirl = new OuterUserInfo();
        for(int i=0;i<111;i++){
            iUserInfo.getMobileNumber();
        }
    }
}
