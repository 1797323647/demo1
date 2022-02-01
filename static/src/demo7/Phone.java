package demo7;

public class Phone {
    //创建全局参数，用于判读线程流程
    private boolean flag = false;

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.run();
    }

    private void run() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //死循环，用于不断的模拟运行
                    while (true) {
                        synchronized (Phone.this) {
                            if (flag) {
                            } else {
                                System.out.println("有电话接入~~~~");
                                flag = true;//更改参数状态
                                Phone.this.notifyAll();//唤醒所有线程
                                Phone.this.wait();//休眠此条线程
                            }

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //死循环，用于不断的模拟运行
                    while (true) {
                        synchronized (Phone.this) {
                            if (flag) {
                                System.out.println("通话中~~~~");
                                Thread.sleep(5000);//休眠线程5秒，模拟业务
                                flag = false;
                                Phone.this.notifyAll();
                                Phone.this.wait();
                            } else {
                                Phone.this.notifyAll();//第一次线程执行到这自动唤醒所有线程
                                Phone.this.wait();//第一次线程执行到这自动休眠
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
