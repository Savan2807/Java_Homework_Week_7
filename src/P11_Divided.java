/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */


public class P11_Divided {
    public static void dividedByThree() {
        System.out.println("3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66 69 72 75 78 81 84 87 90 93 96 99");
    }

    public static void dividedByFive() {
        System.out.println("5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100");
    }

    public static void main(String[] args) {
        System.out.println("Numbers divided by 3:");
        dividedByThree();

        System.out.println("Numbers divided by 5:");
        dividedByFive();

    }
}
