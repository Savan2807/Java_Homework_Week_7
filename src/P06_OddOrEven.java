import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class P06_OddOrEven {

    public void oddoreven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int userInput = scanner.nextInt();
        P06_OddOrEven p06_oddOrEven = new P06_OddOrEven();
        p06_oddOrEven.oddoreven(userInput);
        scanner.close();
    }
}

