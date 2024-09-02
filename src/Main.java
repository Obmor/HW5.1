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
        int targetNum = -10;
        double p = -9;
        double d = -5;
        if (targetNum > p && targetNum > d && p > d) {
            System.out.println(p);
        } else if (targetNum > p && targetNum > d && p < d) {
            System.out.println(d);
        } else if (targetNum < p && targetNum < d && p > d) {
            System.out.println(d);
        } else if (targetNum > p && targetNum > d && p < d) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("Exercise 3.");

    }
}