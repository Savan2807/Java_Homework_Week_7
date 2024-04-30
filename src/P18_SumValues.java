import java.util.Scanner;

/**
 * Write a Java program to sum values of an array.
 */


public class P18_SumValues {
    public static void avg() {
        Scanner obj = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Enter the elements:");
        for (int i=0; i<10; i++)
        {
            array[i] = obj.nextInt();
        }
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+ sum);
    }

    public static void main(String[] args) {
        avg();
    }
}
