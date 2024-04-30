import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */


public class P07_Commission {
    public static double testcommission() {
        Scanner commission = new Scanner(System.in);//scan user input
        System.out.println("Enter amount:");
        double amount = commission.nextInt();//amount object
        System.out.println("Enter commissionPercentage:");
        double commissionPercentage = commission.nextDouble();// logic for commission
        double commission1 = (commissionPercentage / 100) * amount;
        return commission1;
    }

    public static void main(String[] args) {
        System.out.println("Commission amount=" + testcommission());//call testcommission method
    }
}

