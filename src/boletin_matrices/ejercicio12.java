/*
12. Crea un metodo que transforme una matriz CUADRADA
(tienes que realizar dicha comprobación) que recibe por
parámetro, en otra, que debe ser su reflejo en diagonal (de
arriba a la izquierda a abajo a la derecha):
1 2 3 4 5       1 6 3 9 0
6 7 8 9 0       2 7 2 5 9
3 2 1 4 5  -->  3 8 1 8 8
9 5 8 6 7       4 9 4 6 5
0 9 8 5 4       5 0 5 7 4

 */

package boletin_matrices;

import java.util.Arrays;

public class ejercicio12 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        System.out.println(Arrays.deepToString(crearReflejo(matriz)));

        if (comprobarCuadrado(matriz)) {
            System.out.println("Es cuadrada");
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(Arrays.toString(matriz[i]));
            }
        } else {
            System.out.println("No es cuadrada");
        }
    }

    private static boolean comprobarCuadrado(int[][] matriz) {
        int filas = matriz.length;
        for (int i = 0; i < matriz.length; i++) {
            if (filas != matriz[i].length) {
                return false;
            }
        }
        return true;
    }

    private static int[][] crearReflejo(int[][] matriz) {
        int[][] matrizEspejo = new int [matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizEspejo[i][j] = matriz[j][i];
            }
        }
        return matrizEspejo;
    }
}
