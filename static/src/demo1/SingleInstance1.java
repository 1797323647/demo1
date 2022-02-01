package demo1;

public class SingleInstance1 {

//    单例设计模式之饿汉单例模式

    /**
     * 1.定义一个私有的构造器
     */
    private SingleInstance1() {

    }

    /**
     * 2.创建一份实例化对象
     */
    public static SingleInstance1 singleInstance1 = new SingleInstance1();


}
