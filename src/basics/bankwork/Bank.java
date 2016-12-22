package basics.bankwork;

/**
 * Created by Kostya on 21.12.2016.
 */
public class Bank {
    private String name;
    private Deposit[] deposits = new Deposit[10];
    private int i = 0;

    public Bank(String name) {
        this.name = name;
    }
    public void addDeposit(Deposit deposit) {
        if (i == 10) throw new ArrayIndexOutOfBoundsException();
        deposits[i] = deposit;
        i++;
    }
    public double[] countMoney(int years) {
        double[] money = new double[3];
        for (int i=0;i<money.length;i++) {
            money[i] = deposits[i].getNetProfit(years);
        }
        return money;
    }
}
