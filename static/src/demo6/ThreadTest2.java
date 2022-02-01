package demo6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 可以返回的多线程程序
 */
public class ThreadTest2 {
    public static void main(String[] args) throws Exception {
        //实例化 Thread2 对象
        Callable<Integer> callable = new Thread2(100);
        //用 FutureTask 把 Callable 封装成线程任务对象
        FutureTask<Integer> f1 = new FutureTask<>(callable);
        //把线程对象交给Thread处理
        Thread thread = new Thread(f1);
        //调用Thread的start方法，执行任务
        thread.start();
        //拿到线程任务返回的数据
        System.out.println(f1.get());
        //主方法执行中
        // for (int i = 0; i < 10; i++) {
        // System.out.println("主方法执行中！");
        // }
    }
}

/**
 * 定义一个类 实现Callable接口
 */
class Thread2 implements Callable<Integer> {

    private int number;

    public Thread2(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
