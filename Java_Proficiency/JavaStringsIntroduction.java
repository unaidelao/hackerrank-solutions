/**
 * Java Strings Introduction
 * 
 * Input Format
 * The first line contains a string A. The second line contains another string B. The strings are
 * comprised of only lowercase English letters.
 * 
 * Output Format
 * There are three lines of output:
 *     For the first line, sum the lengths of A and B.
 *     For the second line, write Yes if A is lexicographically greater than B, otherwise print No.
 *     For the third line, capitalize the first letter in both A and B and print them on a single
 *     line, separated by a space.
 * 
 * @author Unai de la O
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println(A.charAt(0) > B.charAt(0) ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " +
                           B.substring(0,1).toUpperCase() + B.substring(1));
    }
}