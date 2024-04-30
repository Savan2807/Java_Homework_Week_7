import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class P01_TernaryOperator {
    public void ternaryOperator(int a) {
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is = " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int userinput = scanner.nextInt();

        P01_TernaryOperator p01_ternaryOperator = new P01_TernaryOperator();
        p01_ternaryOperator.ternaryOperator(userinput);

        scanner.close();
    }
}
