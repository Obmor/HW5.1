import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {


        System.out.println("Exercise 1.");
        int a = 30;
        if (a % 2 == 0 && a != 0) {
            System.out.println("Число " + a + " четное.");
        } else {
            System.out.println("Число " + a + " не четное.");
        }


        System.out.println();
        System.out.println("Exercise 2.");
        int targetNum = 47;
        double p = 91;
        double d = 5;
        if (targetNum >= p && targetNum >= d && p > d) {
            System.out.println(p + " Ответ 1");
        } else if (targetNum > p && targetNum > d && p < d) {
            System.out.println(d + " Ответ 2");
        }
        if (targetNum < p && targetNum < d && p < d) {
            System.out.println(p + " ответ 3");
        } else if (targetNum < p && targetNum < d && p > d) {
            System.out.println(d + " Ответ 4");
        }
        if (targetNum > p && targetNum < d && d - targetNum > targetNum - p) {
            System.out.println(p + " Ответ 5");
        } else if (targetNum > p && targetNum < d && d - targetNum < targetNum - p) {
            System.out.println(d + " Ответ 6");
        }
        if (targetNum < p && targetNum > d && p - targetNum > targetNum - d) {
            System.out.println(d + " Ответ 7");
        } else if (targetNum < p && targetNum > d && p - targetNum < targetNum - d) {
            System.out.println(p + " Ответ 8");
        }


        System.out.println();
        System.out.println("Exercise 4.");
        int one = 100 + ThreadLocalRandom.current().nextInt(899);
        if (one >= 100 && one <= 999) {
            System.out.println(one);
            int firstMember = one / 100;
            int secondMember = one / 10 % 10;
            int therdMember = one % 10;
            System.out.println(one);
            if (firstMember >= secondMember && firstMember >= therdMember) {
                System.out.println(firstMember);
            } else if (secondMember >= therdMember) {
                System.out.println(secondMember);
            } else {
                System.out.println(therdMember);
            }
        }


        System.out.println();
        System.out.println("Exercise 5.");
        int x = -999 + ThreadLocalRandom.current().nextInt(1999);
        int y = -999 + ThreadLocalRandom.current().nextInt(1999);
        int z = -999 + ThreadLocalRandom.current().nextInt(1999);
        if (x >= -999 && y >= -999 && z >= -999 && x <= 999 && y <= 999 && z <= 999) {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
        }
        if (x > y && x > z && y > z) {
            System.out.println(z + " " + y + " " + x);
        } else if (x > y && x > z && z > y) {
            System.out.println(y + " " + z + " " + x);
        } else if (y > z && y > x && z > x) {
            System.out.println(x + " " + z + " " + y);
        } else if (y > z && y > x && x > z) {
            System.out.println(z + " " + x + " " + y);
        } else if (z > x && z > y && x > y) {
            System.out.println(y + " " + x + " " + z);
        } else if (z > x && z > y && y > x) {
            System.out.println(x + " " + y + " " + z);
        }


        // копипаста из задачника
        System.out.println();
        System.out.println("Exercise 6.");
        int currentTime = ThreadLocalRandom.current().nextInt(28001);
        int workday = 28800;
        int secondsLeft = workday - currentTime;
        float hoursLeft = Math.round(secondsLeft / (60.0f * 60f));
        System.out.println("До конца рабочего дня осталось " + secondsLeft + " секунд");
        System.out.println("До конца рабочего дня осталось " + hoursLeft + " час(а/ов)");
    }
}