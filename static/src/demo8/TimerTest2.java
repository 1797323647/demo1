package demo8;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 使用线程池创建定时任务
 */
public class TimerTest2 {
    public static void main(String[] args) {
        ScheduledExecutorService pool = new ScheduledThreadPoolExecutor(3);
        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "Hello World AAA");
                System.out.println(10 / 0);
            }
        }, 0, 1, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "Hello World BBB");
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
}
