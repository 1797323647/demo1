package demo8;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 测试基本定时器任务
 * <p>
 * 存在bug，由于是单线程，当一个任务出错时会影响其他的任务
 */
public class TimerTest1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "hello world");
                /**
                 * 异常
                 */
                System.out.println(10 / 0);
            }
        }, 5000, 3000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "hello world");
            }
        }, 5000, 3000);
    }
}
