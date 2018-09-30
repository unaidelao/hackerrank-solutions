/**
 * Java Stdin and Stdout 1 - Java
 * 
 * Most HackerRank challenges require you to read input from stdin (standard input) and write
 * output to stdout (standard output).
 * 
 * One popular way to read input from stdin is by using the Scanner class and specifying the Input
 * Stream as System.in. 
 * 
 * Alternatively, you can use the BufferedReader class.
 * 
 * In this challenge, you must read 3 integers from stdin and then print them to stdout. Each
 * integer must be printed on a new line. To make the problem a little easier, a portion of the
 * code is provided for you in the editor below.
 * 
 * @author Unai de la O
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}