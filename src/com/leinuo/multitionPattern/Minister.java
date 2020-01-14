package com.leinuo.multitionPattern;

/**
 * Create by leinuo on 20-1-14 上午10:00
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class Minister {
    public static void main(String[] args) {
        int ministerNum=10;
        for(int i=0;i<ministerNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("大臣"+(i+1)+"号，参拜");
            emperor.emperorInfo();
        }
        for(int i=0;i<ministerNum;i++){
            Emperor emperor = Emperor.getInstance(5);
            System.out.print("大臣"+(i+1)+"号，参拜");
            emperor.emperorInfo(i);
        }
    }
}
