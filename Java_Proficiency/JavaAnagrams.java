/**
 * Java Anagrams
 * 
 * Check if two strings are anagrams.
 * 
 * @author Unai de la O
 */
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;
        
        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();
        int[] s1mapeo = new int[26];
        int[] s2mapeo = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            s1mapeo[(s1.charAt(i)-97)]++;
        }
        
        for (int j = 0; j < s2.length(); j++) {
            s2mapeo[(s2.charAt(j)-97)]++;
        }
        
		System.err.println(Arrays.toString(s1mapeo));
		System.err.println(Arrays.toString(s2mapeo));
        return Arrays.equals(s1mapeo, s2mapeo);
    }
	public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}