package basics.fightclub;

import java.util.Scanner;

public class Player {
    static String name;
    static int blockednumber;
    static int hp = 100;
    static int hitnumber;

    Player() {
        if (!WhoIsAttack.getSignup()) {
            register();
        }
        if (WhoIsAttack.getAttack()) {
            WhoIsAttack.addRound();
            System.out.println("*****************************РАУНД " + WhoIsAttack.getRounds() + "******************************");
            Scanner sc = new Scanner(System.in);
            System.out.println("Игрок " + getName() + ": Выберите часть тела для атаки: 1. Голова; 2. Корпус; 3. Ноги");
            hitnumber = sc.nextInt();
            System.out.println("Игрок " + getName() + ": атакует в " + GetHitStr());
            new Computer();
        } else {
            String currentblock = setBlock();
            String currenthit = Computer.GetHitStr();
            System.out.println(getName() + ": Установлена защита: " + currentblock);
            if (!currenthit.equals(currentblock)) {
                if (currenthit.equals("Голова")) {
                    hp -= 30;
                } else if (currenthit.equals("Корпус")) {
                    hp -= 30;
                } else if (currenthit.equals("Ноги")) {
                    hp -= 30;
                }
                System.out.println("Игрок " + Computer.getName() + " нанес удар в " + currenthit);
            }
            if (currenthit.equals(currentblock)) {
                System.out.println("Удар заблокирован.");
            }
            System.out.println("Здоровье " + getName() + ": " + getHp() + ". Здоровье  " + Computer.getName() + " : " + Computer.getHp());
            if (getHp() <= 0) {
                System.out.println("Game Over. Winner: " + Computer.getName());
                System.exit(0);
            } else {
                WhoIsAttack.setAttack(true);
                System.out.println("Игроки меняются местами.");
                new Player();
            }
        }
    }

    public static int getHit() {
        return hitnumber;
    }

    public static String GetHitStr() {
        String hitstr = "Nothing";
        switch (hitnumber) {
            case 1:
                hitstr = "Голова";
                break;
            case 2:
                hitstr = "Корпус";
                break;
            case 3:
                hitstr = "Ноги";
                break;
        }
        return hitstr;
    }

    public static String setBlock() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Игрок " + getName() + ": Выберите часть тела для защиты: 1. Голова; 2. Корпус; 3. Ноги");
        blockednumber = sc.nextInt();
        String blockedstr = "";
        switch (blockednumber) {
            case 1:
                blockedstr = "Голова";
                break;
            case 2:
                blockedstr = "Корпус";
                break;
            case 3:
                blockedstr = "Ноги";
                break;
        }
        return blockedstr;
    }

    public static String getName() {
        return name;
    }

    public static int getHp() {
        return hp;
    }

    public static void register() {
        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        WhoIsAttack.setSignup(true);
    }
}
