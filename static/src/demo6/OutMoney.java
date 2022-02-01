package demo6;

public class OutMoney extends Thread {

    private Money money;

    public OutMoney(Money money, String name) {
        super(name);
        this.money = money;
    }

    @Override
    public void run() {

        money.outMoney(100000);

    }
}
