/**
 * Java Static Initializer Block
 * 
 * Static initialization blocks are executed when the class is loaded, and you can initialize
 * static variables in those blocks.
 * 
 * You are given a class Solution with a main method. Complete the given code so that it outputs
 * the area of a parallelogram with breadth B and height K. You should read the variables from
 * the standard input.
 * 
 * If B <=0 or H <= 0 , the output should be "java.lang.Exception: Breadth and height must be
 * positive" without quotes.
 * 
 * @author Unai de la O
 */
import java.util.Scanner;

public class Solution {
    private static int B;
    private static int H;
    private static boolean flag;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        in.close();
        
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        else {
            flag = true;
        }
    }//end of static block
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
