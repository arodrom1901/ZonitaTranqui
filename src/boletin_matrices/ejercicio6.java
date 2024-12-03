/*
6. Crea un metodo que reciba una matriz e imprima,
en una sola línea, los elementos de la
misma, pero leídos por columna, empezando por los últimos índices:
 */

package boletin_matrices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce la longitud de la fila de la matriz");
        int tamano_fila = sc.nextInt();

        System.out.println("Introduce la longitud de las columnas de la matriz");
        int tamano_columna = sc.nextInt();

        //Crea una tabla con el tamaño de filas y columnas dicho por el usuario
        int[][] tabla = new int[tamano_fila][tamano_columna];

        System.out.println(Arrays.deepToString(tabla));

        //Metodo para llenar la tabla
        llenarTabla(tabla);
    }

    private static int[][]tabla(int tamano_fila, int  tamano_columna) {
       int [][] tabla = new int[tamano_fila][tamano_columna];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                Random random = new Random();
                int random1 = random.nextInt(10);
                tabla[i][j] = random1;
            }
        }
        return tabla;
    }

    private static void llenarTabla(int[][] tabla) {
        System.out.print("La salida es: ");
        for (int j = tabla[0].length-1; j >= 0; j--) {
            for (int i = tabla.length-1; i >= 0; i--) {
                System.out.printf("%s ", tabla[i][j]);
            }
        }
    }
}
