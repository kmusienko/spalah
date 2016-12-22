package basics.bankwork;

import java.util.Scanner;

/**
 * Created by Kostya on 22.12.2016.
 */
public class Run {
    public static void main(String[] args) {
        Bank bank = new Bank("First bank");
        Deposit firstDeposit = new Deposit(100, 10, "10% rate");
        Deposit secondDeposit = new Deposit(200, 5, "5% rate");
        Deposit thirdDeposit = new Deposit(10, 25, "25% rate");
        bank.addDeposit(firstDeposit);
        bank.addDeposit(secondDeposit);
        bank.addDeposit(thirdDeposit);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of years: ");
        int years = sc.nextInt();
        for (int i=0;i<3;i++) {
            System.out.println(bank.countMoney(years)[i]);
        }

    }
}
