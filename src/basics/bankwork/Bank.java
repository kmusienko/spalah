package basics.bankwork;

import java.util.ArrayList;

/**
 * Created by Kostya on 21.12.2016.
 */
public class Bank {
    private String name;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private int i = 0;
    private int j = 0;

    public Bank(String name) {
        this.name = name;
    }
    public void addDeposit(Deposit deposit) {
        if (i == 10) throw new ArrayIndexOutOfBoundsException();
        deposits.add(deposit);
        i++;
    }
    public double countMoney(int years) {
        //ouble[] money = new double[3];
//        for (int i=0;i<money.length;i++) {
//                money[i] = deposits.get(i).getNetProfit(years);
//        }
//        return money;
        return deposits.get(j++).getNetProfit(years);
    }
    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }
}
