/**
 * Java String Tokens
 * 
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into
 * tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print
 * the number of tokens, followed by each token on a new line.
 * 
 * @author Unai de la O
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        int total;

        // Algún caso de prueba debe tener espacios extra.
        // Se eliminan los exteriores con trim()
        s.trim();
        // Y los interiores con replace()
        s.replaceAll("\\s+","");
        
        // Para los casos en los que no se recibe carácter alguno.
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        // Separa todos los carácteres no alfabéticos.
        String[] sArr = s.split("[^a-zA-Z]+");

        // Asigna valor a la variable 'total'.
        total = sArr.length;

        // Imprime el resultado pedido.
        // Si con todas las operaciones el array está vacío, se imprime sólo la longitud.
        if (total == 0) {
            System.out.println(total);
        }
        // En caso de que al hacer replace() se nos quede el primer elemento vacío, obviamos.
        else if (sArr[0].equals("")) {
            System.out.println(total -1);
            for (int i = 1; i < sArr.length; i++) {
                System.out.println(sArr[i]);
            }
        }
        else {
            System.out.println(total);
            for (String str : sArr) {
                System.out.println(str);
            }
        }
    }
}