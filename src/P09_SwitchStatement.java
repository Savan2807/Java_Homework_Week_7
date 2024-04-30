import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry using switch statement.
 */


public class P09_SwitchStatement {

    public static void switchStatement(char alphabet) {

        String cityName;
        if (alphabet >= 'A' && alphabet <= 'F') {
            switch (alphabet) {
                case 'A':
                    cityName = "Amsterdam";
                    break;
                case 'B':
                    cityName = "Berlin";
                    break;
                case 'C':
                    cityName = "Copenhagen";
                    break;
                case 'D':
                    cityName = "Dublin";
                    break;
                case 'E':
                    cityName = "Edinburgh";
                    break;
                case 'F':
                    cityName = "Frankfurt";
                    break;
                default:
                    cityName = "Unknown";
            }
            System.out.println("City name :- " + cityName);
        } else {
            System.out.println("Invalid Entry");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().toUpperCase().charAt(0);
        switchStatement(alphabet);


        scanner.close();


    }

}
