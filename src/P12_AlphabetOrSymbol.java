import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */


public class P12_AlphabetOrSymbol {
    public static void firstChar(char first) {

        if (Character.isDigit(first)) {
            System.out.println("Input value is a number.");
        } else if (Character.isLetter(first)) {
            System.out.println("Input value is an alphabet.");
        } else {
            System.out.println("Input value is a symbol.");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        char first = scanner.next().toUpperCase().charAt(0);
        firstChar(first);

        scanner.close();
    }


}
