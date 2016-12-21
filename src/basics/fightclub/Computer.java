package basics.fightclub;

import java.util.Random;

public class Computer {
    static String name = "Computer";
    static int blockednumber;
    static int hp = 100;
    static int hitnumber;

    Computer() {
        String current_block = setBlock();
        String current_hit = Player.GetHitStr();
        System.out.println(getName() + ": Установлена защита: " + current_block);
        if (current_hit != current_block) {
            if (current_hit.equals("Голова")) {
                hp -= 30;
            } else if (current_hit.equals("Корпус")) {
                hp -= 30;
            } else if (current_hit.equals("Ноги")) {
                hp -= 30;
            }
            System.out.println("Игрок " + Player.getName() + " нанес удар в " + current_hit);
        } else if (current_hit.equals(current_block)) {
            System.out.println("Удар заблокирован.");
        }
        System.out.println("Здоровье " + Player.getName() + ": " + Player.getHp() + ". Здоровье  " + getName() + " : " + getHp());
        if (getHp() <= 0) {
            System.out.println("Game Over. Winner: " + Player.getName());
            System.exit(0);
        } else {
            WhoIsAttack.setAttack(false);
            System.out.println("Игроки меняются местами.");
            WhoIsAttack.addRound();
            System.out.println("*****************************РАУНД " + WhoIsAttack.getRounds() + "******************************");
            Random r = new Random(System.currentTimeMillis());
            hitnumber = 1 + r.nextInt(3);
            System.out.println("Игрок " + getName() + " атакует в " + GetHitStr());
            new Player();
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
        Random r = new Random(System.currentTimeMillis());
        blockednumber = 1 + r.nextInt(3);
        String blockedstr = "Nothing";
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
}
