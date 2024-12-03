/*
8. Crea un metodo que reciba dos matrices,
que deben ser de igual tamaño, y sume el
contenido de las posiciones en una tercera matriz,
que será la que devuelva:
 */

package boletin_matrices;

public class ejercicio8 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}};
        int[][] matriz2 = {{1,2,3}, {4,5,6}};

        comprobarIgualdad(matriz, matriz2);

        int[][] resultado = hacerSuma(matriz, matriz2);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print("[" + resultado[i][j] + "]"+ " ");
            }
            System.out.println();
        }
    }
    private static boolean comprobarIgualdad(int[][] matriz, int[][] matriz2) {
        if (matriz.length != matriz2.length) {

            return false;
        }
        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i].length != matriz2[i].length) {

                return false;
            }
        }
        return true;
    }

    private static int[][] hacerSuma(int[][] matriz,  int[][] matriz2) {
        int[][] suma = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                suma[i][j] = matriz[i][j] + matriz2[i][j];

            }
        }
        return suma;
    }
}
