/**
 * Plus Minus - Java
 * 
 * Given an array of integers, calculate the fractions of its elements that are positive, negative,
 * and are zeros. Print the decimal value of each fraction on a new line.
 * 
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal
 * places, though answers with absolute error of up to 10^-4 are acceptable.
 * 
 * For example, given the array arr = [1,1,0,-1,-1] there are 5 elements, two positive, two
 * negative and one zero. Their ratios would be 2/5 = 0.400000, 2/5 = 0.400000 and 1/5 = 0.200000.
 * 
 * It should be printed as:
 *     0.400000
 *     0.400000
 *     0.200000
 * 
 * @author Unai de la O
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float positives = 0f;
        float negatives = 0f;
        float zeroes = 0f;
        
        for (int n : arr) {
            if (n > 0) positives++;
            else if (n < 0) negatives++;
            else zeroes++;
        }
        System.out.println(positives / arr.length);
        System.out.println(negatives / arr.length);
        System.out.println(zeroes / arr.length);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
