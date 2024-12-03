/*
4. Crea un metodo que reciba una matriz e
imprima, en una sola línea, los elementos de la
misma, leídos por filas,
empezando por los últimos índices:
*/

package boletin_matrices;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
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

        int numero;//Variable para guardar los números que ocupan las posiciones [i] [j]

        //Recorro las posiciones de la matriz
        for (int i = tabla.length - 1; i >= 0; i--) { //Recorre fila
            for (int j = tabla[i].length - 1; j >= 0; j--) { //Recorre columnas

                numero = tabla[i][j]; //Guardo cada numero de las posiciones en "Emilio" y la imprimo en la siguiente fila
                System.out.print(numero + ", ");
            }
        }
    }
    //Metodo para llenar la tabla
    public static void llenarTabla(int[][] tabla) {

        System.out.println("Rellena la tabla muñeca");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println("Pon la posición [" + i + " ] [ " + j + " ]");
                    tabla[i][j] = sc.nextInt();
            }
        }
    }
}