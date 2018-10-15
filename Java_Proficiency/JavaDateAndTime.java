/**
 * Java Date and Time
 * 
 * The Calendar class is an abstract class that provides methods for converting between a specific
 * instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on,
 * and for manipulating the calendar fields, such as getting the date of the next week.
 * 
 * You are given a date. You just need to write the method, getDay, which returns the day on that
 * date.
 * 
 * Input Format
 * A single line of input containing the space separated month, day and year, respectively, in
 * MM DD YYYY format.
 * 
 * Output Format
 * Output the correct day in capital letters.
 * 
 * @author Unai de la O
 */
import java.util.Scanner;
import java.time.LocalDate;

public class Solution {
    public static String getDay(String d, String m, String y) {
        int day = Integer.parseInt(d);
        int month = Integer.parseInt(m);
        int year = Integer.parseInt(y);
        LocalDate ld = LocalDate.of(year, month, day);
        return ld.getDayOfWeek().toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}