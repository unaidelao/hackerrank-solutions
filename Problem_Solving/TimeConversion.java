/**
 * Time Conversion
 * 
 * Given a time in 12-hour AM/PM format, convert ir to military (24-hour) time.
 * 
 * Sample input:  07:05:45PM
 * Sample output: 19:05:45
 * 
 * @author Unai de la O
 */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        int hour = Integer.parseInt(s.substring(0, 2));
        String hourStr = "";

        if ((hour == 24) || (s.substring(8).equals("AM") && hour == 12)) {
            hourStr = "00";
        }  else if (s.substring(8).equals("PM") && hour <= 11) {
            hour += 12;
            hourStr = String.valueOf(hour);
        } else if (hour < 10) {
            hourStr = "0" + String.valueOf(hour);
        } else {
            hourStr = String.valueOf(hour);
        }

        return hourStr + s.substring(2, 8);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
