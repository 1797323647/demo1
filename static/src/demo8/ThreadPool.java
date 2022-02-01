package demo8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//用线程池工具类执行线程
public class ThreadPool {

    private static int num = 100;

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(() -> {
            System.out.println("hello world");
        });
    }
}
