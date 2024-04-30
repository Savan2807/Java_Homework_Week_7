import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */


public class P17_NumericAndStringArray {

    public static void numericAndStringArra(){
        int[] numericArray = {5, 2, 9, 1, 7};
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        String[] stringArray = {"banana", "apple", "orange", "grape", "pineapple"};
        System.out.println("\nOriginal string array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }

    public static void main(String[] args) {
     numericAndStringArra();
    }
}
