package com.leinuo.design1.builderPattern;

/**
 * Create by leinuo on 20-1-16 下午4:44
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 建造者模式最主要功能是基本方法的调用顺序安排，也就是这些基本方
 * 法已经实现了；而工厂方法则重点是创建，你要什么对象我创造一个对象出来，组装顺序则不是他关心的。
 */
public class Client {
    public static void main(String[] args) {
//        BenzModel benzModel = new BenzModel();
//        ArrayList<String> sequence = new ArrayList();
//        sequence.add("engineboom");
//        sequence.add("start");
//        sequence.add("stop");
//        benzModel.setSequence(sequence);
//        benzModel.run();

//        ArrayList<String> sequence = new ArrayList();
//        sequence.add("engineboom");
//        sequence.add("start");
//        sequence.add("stop");
//        BenzBuilder benzBuilder = new BenzBuilder();
//        //把顺序给这个builder类，制造出这样一个车出来
//        benzBuilder.setSequence(sequence);
//        //制造出一个奔驰车
//        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
//        //奔驰车跑一下看看
//        benz.run();
//
//        //按照同样的顺序，我再要一个宝马
//        BMWBuilder bmwBuilder = new BMWBuilder();
//        bmwBuilder.setSequence(sequence);
//        BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
//        bmw.run();

        Director director = new Director();
        int num = 10;
        for(int i=0;i<num;i++){
            director.getABenzModel().run();
        }

        for(int i=0;i<num;i++){
            director.getBBenzModel().run();
        }

        for(int i=0;i<num;i++){
            director.getCBMWModel().run();
        }

        for(int i=0;i<num;i++){
            director.getDBMWModel().run();
        }


    }
}
