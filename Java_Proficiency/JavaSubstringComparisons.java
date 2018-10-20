/**
 * Java Substring Comparisons
 * 
 * Given a string, s, and an integer, k, complete the function so that it finds the
 * lexicographically smallest and largest substrings of length k.
 * 
 * Return the respective lexicographically smallest and largest substrings as a single
 * newline-separated string.
 * 
 * @author Unai de la O
 */
import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for (int i = 0; i < s.length()-k+1; i++) {
            String temp = s.substring(i, i+k);
            if (smallest.compareTo(temp) > 0) smallest = temp;
            if (largest.compareTo(temp) < 0) largest = temp;
        }
        
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}