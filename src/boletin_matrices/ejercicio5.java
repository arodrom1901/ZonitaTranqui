/*
5. Crea un metodo que reciba una matriz e imprima,
en una sola línea, los elementos de la
misma, pero leídos por columnas:
 */

package boletin_matrices;

import java.util.Scanner;

public class ejercicio5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce la longitud de la fila de la matriz");
        int tamano_fila = sc.nextInt();

        System.out.println("Introduce la longitud de las columnas de la matriz");
        int tamano_columna = sc.nextInt();

        //Crea una tabla con el tamaño de filas y columnas dicho por el usuario
        int[][] tabla = new int[tamano_fila][tamano_columna];

        //Metodo para llenar la tabla
        llenarTabla(tabla);

        //Mostrar la tabla
        for (int i = 0; i < tabla[0].length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[j][i] + " ");
            }
        }
    }
    //Metodo para llenar la tabla
    public static void llenarTabla(int[][] tabla) {

        System.out.println("Rellenala");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println("Pon la posición [" + i + "] [" + j + "]");
            }
        }
    }
}

