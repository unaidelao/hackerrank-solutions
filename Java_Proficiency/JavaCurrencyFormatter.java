/**
 * Java Currency Formatter
 * 
 * Given a double-precision number, payment, denoting an amount of money, use the NumberFormat
 * class' getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French
 * currency formats.
 * 
 * Note: India does not have a built-in Locale, so you must construct one where the language is
 * en (i.e., English).
 * 
 * Sample Input
 * 12324.134
 * 
 * Sample Output
 * US: $12,324.13
 * India: Rs.12,324.13
 * China: ￥12,324.13
 * France: 12 324,13 €
 * 
 * @author Unai de la O
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "in");

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}