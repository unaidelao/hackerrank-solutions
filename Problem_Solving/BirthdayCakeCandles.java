import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

/**
 * Birthday Cake Candles
 * 
 * You are in charge of the cake for your niece's birthday and have decided the cake will have one
 * candle for each year of her total age. When she blows out the candles, she’ll only be able to
 * blow out the tallest ones. Your task is to find out how many candles she can successfully blow
 * out.
 * 
 * For example, if your nieve is turning 4 years old, and the cake will have 4 candles of height
 * [4,4,1,3], she will be able to blow out 2 candles succesfully, since the tallest candles are of
 * height 4 and there are 2 such candles.
 * 
 * @author Unai de la O
 */
public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int candles = 0;
        int maxCandleHeight = Arrays.stream(ar).max().getAsInt();

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == maxCandleHeight) {
                candles++;
            }
        }

        return candles;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
