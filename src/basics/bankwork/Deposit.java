package basics.bankwork;

/**
 * Created by Kostya on 21.12.2016.
 */
public class Deposit {
    private int initialAmount;
    private double interestRate;
    private String name;

    public Deposit(int initialAmount, int interestRate, String name) {
        this.initialAmount = initialAmount;
        this.interestRate = interestRate;
        this.name = name;
    }
    public double getNetProfit(int years) {
        double profit = initialAmount;
        for (int i=0;i<years;i++) {
            profit = profit + profit * interestRate/100;
        }
        return profit - initialAmount;
    }

}
