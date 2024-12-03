/*
10. Crea un metodo que compruebe si una matriz pasada por
parámetro es simétrica en
función del eje Y. Es decir, la matriz
 */

package boletin_matrices;

public class ejercicio10 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        boolean comparar = compruebaSimetriaEnY(matriz);
        System.out.println(comparar);
    }

    private static boolean compruebaSimetriaEnY(int[][] matriz2) {

        for (int j = 0; j < matriz2[0].length; j++) {
            for (int i = 0; i < matriz2.length; i++) {
                if (matriz2[i][j] != matriz2[i][matriz2[i].length-1-j]) {

                    return false;
                }
            }
        }
        return true;
    }
}