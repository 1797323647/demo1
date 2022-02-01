package demo6;

/**
 * 模拟取钱
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        //创建账户实例对象
        Money money = new Money(100000);
        new OutMoney(money, "一号").start();
        new OutMoney(money, "二号").start();

    }
}
