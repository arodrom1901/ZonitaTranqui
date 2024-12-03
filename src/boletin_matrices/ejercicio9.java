/*
9. Crea un metodo que compruebe si una
matriz pasada por parámetro es simétrica en
función del eje X. Es decir, la matriz
 */

package boletin_matrices;

public class ejercicio9 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
        boolean comparar = simetricaMatriz(matriz);
        System.out.println(comparar);
    }

    public static boolean simetricaMatriz(int[][] matriz1) {

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz1[matriz1.length - 1 - i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}