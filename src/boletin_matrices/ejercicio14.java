/*
14. Crea un metodo que transforme una matriz cualquiera,
convirtiendo sus filas encolumnas y viceversa.
 */

package boletin_matrices;

import java.util.Arrays;

public class ejercicio14 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.deepToString(crearReflejo(matriz)));

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("---------------");
        transformarMatrizInversa(matriz);
    }

    public static int[][] transformarMatrizInversa(int[][] matriz) {
        int[][] nuevaMatriz = new int[matriz.length][matriz.length];
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz.length - 1; j >= 0; j--) {
                nuevaMatriz[j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < nuevaMatriz.length; i++) {
            for (int j = 0; j < nuevaMatriz.length; j++) {
                System.out.printf("%d ", nuevaMatriz[i][j]);
            }
            System.out.println(" ");
        }
        return nuevaMatriz;
    }

    private static int[][] crearReflejo(int[][] matriz) {
        int[][] matrizEspejo = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizEspejo[i][j] = matriz[j][i];
                System.out.printf("%d ", matrizEspejo[i][j]);
            }
            System.out.println(" ");
        }
       return matrizEspejo;
    }
}