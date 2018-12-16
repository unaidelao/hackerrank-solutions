/**
 * Grading Students
 * 
 * HackerLand University has the following grading policy:
 *   - Every student receives a grade in the inclusive range from 0 to 100.
 *   - Any grade less than 40 is a failing grade.
 * 
 * Sam is a professor at the university and likes to round each student's grade according to these
 * rules:
 *   - If the difference between the grade and the next multiple of 5 is less than 3, round grade
 *   up to the next multiple of 5.
 *   - If the value of grade is less than 38, no rounding occurs as the result will still be a
 *   failing grade.
 * 
 * For example, grade = 84 will be rounded to 85 but grade = 29 will not be rounded because the
 * rounding would result in a number that is less than 40.
 * 
 * Given the initial value of grade for each of Sam's n students, write code to automate the
 * rounding process.
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
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] result = new int[grades.length];

        for (int i = 0; i < result.length; i++) {
            if (grades[i] >= 38) {
                int dif = (grades[i] + 5) % 5;
                
                if (dif >= 3) {
                    grades[i] += (5 - dif);
                    result[i] = grades[i];
                }
                else {
                    result[i] = grades[i];
                }
            }
            else {
                result[i] = grades[i];
            }
        }
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
