/**
 * Java String Reverse
 * 
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 * 
 * @author Unai de la O
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(isPalindrome(A) ? "Yes" : "No");
    }
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1 -i)) {
                return false;
            }
        }
        return true;
    }
}