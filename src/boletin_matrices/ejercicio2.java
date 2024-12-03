/*
2. Crea un metodo que sume todas las posiciones de
una matriz y devuelva dicho número.
 */

package boletin_matrices;

public class ejercicio2 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}};
        int suma = matrizSuma(matriz);
        System.out.println(suma);
    }

    public static int matrizSuma(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];

            }
        }
        return suma;
    }
}
