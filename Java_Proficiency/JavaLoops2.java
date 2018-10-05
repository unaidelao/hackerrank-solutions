/**
 * Java Loops 2
 * 
 * We use the integers a, b, and n to create the following series:
 *     (a+2^0·b),(a+2^0·b+2^1·b),...,(a+2^0·b+2^1.b+...+2^n-1·b)
 * 
 * For each query, print the corresponding series on a new line. Each series must be printed in
 * order as a single line of n space-separated integers.
 * 
 * @author Unai de la O
 */
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            for (int j = 0; j < n; j++) {
                result += b * (int) Math.pow(2, j);
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}