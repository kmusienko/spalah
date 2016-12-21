package basics.fightclub;

public class WhoIsAttack {
    private static boolean signup = false;
    private static boolean attack = true;
    private static int rounds = 0;

    public static void setSignup(boolean s) {
        signup = s;
    }

    public static boolean getSignup() {
        return signup;
    }

    public static void setAttack(boolean a) {
        attack = a;
    }

    public static boolean getAttack() {
        return attack;
    }

    public static void addRound() {
        rounds++;
    }

    public static int getRounds() {
        return rounds;
    }
}
