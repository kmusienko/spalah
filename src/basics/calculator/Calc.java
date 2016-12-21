package basics.calculator;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Kostya on 14.12.2016.
 */
public class Calc {
    private static double res = 0;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Введите арифметические действия:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while (!line.equals("exit")) {
            calculate(line);
            line = sc.nextLine();
        }
    }

    private static void calculate(String line) {
        String[] parts = line.split(" ");
        if (parts.length == 2) {
            res = countUp(res, Double.parseDouble(parts[1]), parts[0]);
        } else if (parts.length == 3) {
            res = countUp(Double.parseDouble(parts[0]), Double.parseDouble(parts[2]), parts[1]);
        } else {
            System.out.println("Ошибка ввода!");
            return;
        }
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Result = " + df.format(res));
    }

    private static double countUp(double arg1, double arg2, String operation) {
        double res = 0;
        switch (operation) {
            case "+":
                res = arg1 + arg2;
                break;
            case "-":
                res = arg1 - arg2;
                break;
            case "*":
                res = arg1 * arg2;
                break;
            case "/":
                res = arg1 / arg2;
                break;
        }
        return res;
    }
}
