/**
 * Java Loops 1
 * 
 * In this challenge, we're going to use loops to help us do some simple math.
 * 
 * Given an integer, N, print its first 10 multiples.
 * Each multiple N x i (where 1 <= i <= 10) should be printed on a new line in the form:
 * N x i = result.
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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, (N*i));
        }
    }
}
