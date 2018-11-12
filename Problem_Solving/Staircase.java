import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Staircase - Java
 * 
 * Print a staircase of size n using # symbols and spaces.
 * Note: The last line must have  spaces in it. The staircase is right-aligned.
 * 
 * @author Unai de la O
 */
public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        int lines, spaces, hashes;
        int height = n;
        
        for (lines = 0; lines < height; lines++) {
            for (spaces = 0; spaces < height-lines-1; spaces++) {
                System.out.print(" ");
            }
            for (hashes = 0; hashes < lines+1; hashes++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
