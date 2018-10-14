/**
 * Java End-Of-File
 * 
 * The challenge here is to read n lines of input until you reach EOF, then number and print all n
 * lines of content.
 * 
 * Hint: Java's Scanner.hasNext() method is helpful for this problem.
 * 
 * For each line, print the line number, followed by a single space, and then the line content
 * received as input.
 * 
 * @author Unai de la O
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 1;
        while(in.hasNextLine()) {
            String str = in.nextLine();
            System.out.printf("%d %s\n", counter, str);
            counter++;
        }
        in.close();
    }
}