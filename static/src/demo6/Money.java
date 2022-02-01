package demo6;

public class Money {
    private double money;


    public Money() {
    }

    public Money(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void outMoney(double money) {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + "来取" + money + "元");
                this.money -= money;
                System.out.println(name + "取钱成功！剩余"+this.money);
            } else {
                System.out.println(name + "来取钱，余额不足！");
            }
        }
    }
}
