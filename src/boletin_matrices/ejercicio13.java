/*
13. Crea un metodo que transforme una matriz CUADRADA
(tienes que realizar dicha comprobación) que recibe por
parámetro, en otra, que debe ser su reflejo en diagonal (de
abajo a la derecha a arriba a la izquierda):
1 2 3 4 5        4 7 5 0 5
6 7 8 9 0        5 6 4 9 4
3 2 1 4 5  -->   8 8 1 8 3
9 5 8 6 7        9 5 2 7 2
0 9 8 5 4        0 9 3 6 1
 */

package boletin_matrices;

public class ejercicio13 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
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
        int[][] nuevaMatriz = new int [matriz.length][matriz.length];
        for (int i = matriz.length -1; i >= 0; i--) {
            for (int j = matriz.length -1; j >= 0; j--) {
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
}
