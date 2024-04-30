import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */


public class P02_LeapYear {
    public void leapyear(int year) {

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int userinput = scanner.nextInt();

        P02_LeapYear p02_leapYear = new P02_LeapYear();
        p02_leapYear.leapyear(userinput);

        scanner.close();
    }

}

