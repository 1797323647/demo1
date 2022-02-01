package demo1;

public class SingleInstance2 {
    //单例设计模式之懒汉单例模式

    /**
     * 定义一个私有的构造器
     */
    private SingleInstance2() {

    }

    /**
     * 定义一个静态变量
     */
    private static SingleInstance2 singleInstance2;

    /**
     * 定义一个构建方法
     */
    public static SingleInstance2 getSingleInstance2() {
        if (singleInstance2 == null) {
            singleInstance2 = new SingleInstance2();
        }
        return singleInstance2;

    }
}
