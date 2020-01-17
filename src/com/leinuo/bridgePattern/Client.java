package com.leinuo.bridgePattern;

/**
 * Create by leinuo on 2020/1/17 上午10:21
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 桥接模式
 */
public class Client {
    public static void main(String[] args) {
//        Corp houseCorp = new HouseCorp();
//        houseCorp.makeMoney();
//        Corp clothesCorp = new ClothesCorp();
//        clothesCorp.makeMoney();

        House house = new House();
        Corp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
    }
}
