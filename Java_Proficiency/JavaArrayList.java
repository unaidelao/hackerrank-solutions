import java.io.*;
import java.util.*;

/**
 * Java ArrayList.
 * 
 * == Task ==
 * You are given n lines. In each line there are zero or more integers. You need to answer a few
 * queries where you need to tell the number located in yth position of xth line.
 * Take your input from System.in.
 * 
 * == Input format ==
 * The first line has an integer n. In each of the next n lines there will be an integer d denoting
 * number of integers on that line and then there will be d space-separated integers. In the next
 * line there will be an integer q denoting number of queries. Each query will consist of two
 * integers x and y.
 * 
 * == Output format ==
 * In each line, output the number located in yth position of xth line. If there is no such
 * position, just print "ERROR!".
 * 
 * @author Unai de la O
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Número de líneas
        int n = scanner.nextInt();

        // ArrayList con las líneas de números.
        // Cada línea de números es a su vez otro ArrayList.
        ArrayList<ArrayList<Integer>>datos = new ArrayList<>();

        // Para cada línea, se alojan los números en ArrayList datos.
        for (int i = 0; i < n; i++) {
            // Cantidad de números que va a tener la presente línea.
            int d = scanner.nextInt();
            // Un subArrayList para cada línea, que se añadirá a datos.
            ArrayList<Integer> linea = new ArrayList<>();
            for (int num = 0; num < d; num++) {
                linea.add(scanner.nextInt());
            }
            datos.add(linea);
        }

        // Consultas a realizar sobre el ArrayList datos.
        int q = scanner.nextInt();

        // Se comprueba cada consulta.
        for (int j = 0; j < q; j++) {
            int indiceLinea = scanner.nextInt();
            int indiceDato = scanner.nextInt();

            // Recuperamos el subArrayList respecto a indiceLinea.
            ArrayList<Integer> consulta = datos.get(indiceLinea - 1);
            if (indiceDato <= consulta.size()) {
                System.out.println(consulta.get(indiceDato - 1));
            }
            else {
                System.out.println("ERROR!");
            }
        }
        // Cerramos scanner.
        scanner.close();

    }
}

