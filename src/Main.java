public class Main {
    public static void main(String[] args) {


        System.out.println("Exercise 1.");
        int a = 10;
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
        if        (targetNum > p && targetNum < d && d - targetNum > targetNum - p) {
            System.out.println(p + " Ответ 5");
        } else if (targetNum > p && targetNum < d && d - targetNum < targetNum - p) {
            System.out.println(d + " Ответ 6");
        }
        if        (targetNum < p && targetNum > d && p - targetNum > targetNum - d) {
            System.out.println(d + " Ответ 7");
        } else if (targetNum < p && targetNum > d && p - targetNum < targetNum - d) {
            System.out.println(p + " Ответ 8");
        }
    }
}