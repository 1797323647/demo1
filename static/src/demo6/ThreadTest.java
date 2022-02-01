package demo6;

public class ThreadTest {

    private static int num = 100;

    public static void main(String[] args) {


        while (num >= 1) {
            /**
             * 线程1
             */
            new Thread(() -> System.out.println("还剩余" + --num + "张票")).start();
            /**
             * 线程2
             */
            new Thread(() -> System.out.println("还剩余" + --num + "张票")).start();
            /**
             * 线程3
             */
            new Thread(() -> System.out.println("还剩余" + --num + "张票")).start();
        }


    }

}

