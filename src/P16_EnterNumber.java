import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */


public class P16_EnterNumber {
    public static void enterNumber(int number){

        if (number > 0) {
            System.out.println("Number is POSITIVE");
        } else if (number< 0) {
            System.out.println("Number is NEGATIVE");
        } else {
            System.out.println("Number is ZERO");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = scanner.nextInt();
        enterNumber(number);

        scanner.close();
    }
}
