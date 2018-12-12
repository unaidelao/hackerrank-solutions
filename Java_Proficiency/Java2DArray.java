import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Java 2D Array
 * 
 * You are given a 6 * 6 2D array. An hourglass in an array is a portion shapped like this:
 *     a b c
 *       d
 *     e f g
 * 
 * In this problem you have to print the largest sum among all the hourglasses in the array.
 * 
 * == Sample Input ==
 *     1 1 1 0 0 0 
 *     0 1 0 0 0 0
 *     1 1 1 0 0 0 
 *     0 0 2 4 4 0
 *     0 0 0 2 0 0
 *     0 0 1 2 4 0
 * 
 * == Sample Output ==
 *     19
 * 
 * == Explanation ==
 * The hourglass which has the largest sum is:
 *     2 4 4
 *       2
 *     1 2 4
 * 
 * @author Unai de la O
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int[] blockSums = new int[4];
        blockSums[0] = calcBlockRow(arr, 0);
        blockSums[1] = calcBlockRow(arr, 1);
        blockSums[2] = calcBlockRow(arr, 2);
        blockSums[3] = calcBlockRow(arr, 3);

        System.out.println(Arrays.stream(blockSums).max().getAsInt());
    }

    // Calculates the maximum value for each block in a row.
    private static int calcBlockRow(int[][] arr, int blockRow) {
        int blockLength = 3 + blockRow;
        int counterI = 0 + blockRow;
        int counterJ = 0;
        int jRowLength = 3;
        int sum = 0;
        int maxSum = -999;

        for (int iter = 0; iter < 4; iter++) {
            for (int i = counterI; i < blockLength; i++) {
                for (int j = counterJ; j < jRowLength; j++) {
                    sum += arr[i][j];
                }
            }
            sum -= (arr[counterI + 1][counterJ] + arr[counterI + 1][counterJ + 2]);

            if (counterJ < 4) {
                counterJ++;
                jRowLength++;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            sum = 0;
        }
        // Returns block's max value at this row.
        return maxSum;
    }
}
