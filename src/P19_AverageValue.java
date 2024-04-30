import java.util.Scanner;

/**
 * Write a Java program to calculate the average value of array elements.
 */


public class P19_AverageValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        double array[] = new double[size];
        double sum = 0.0;
        double avg = 0.0
                ;
        System.out.println("Enter array elements: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextDouble();
            sum = sum + array[i];
            avg = sum / array.length;
            System.out.println("Average: " + avg);
        }
    }
}
