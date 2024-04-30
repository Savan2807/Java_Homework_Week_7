import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */


public class P08_IfElse {
    public static void ifelse(char alphabet) {

        String cityName;
        if (alphabet == 'A') {
            cityName = "Amsterdam";
        } else if (alphabet == 'B') {
            cityName = "Berlin";
        } else if (alphabet == 'C') {
            cityName = "Copenhagen";
        } else if (alphabet == 'D') {
            cityName = "Dublin";
        } else if (alphabet == 'E') {
            cityName = "Edinburgh";
        } else if (alphabet == 'F') {
            cityName = "Frankfurt";
        } else {
            cityName = "Unknown";
        }

        if (!cityName.equals("Unknown")) {
            System.out.println("City name: " + cityName);
        } else {
            System.out.println("Invalid Entry");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().toUpperCase().charAt(0);
        ifelse(alphabet);

        scanner.close();
    }
}

