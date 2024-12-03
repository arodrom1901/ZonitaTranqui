/*
11. Crea un metodo que reciba dos matrices,
y compruebe si son matrices inversas, es decir,
si tienen los mismos valores en los índices inversos:
5 8 9 0     2 3 7 1
4 7 5 2  y  2 5 7 4
1 7 3 2     0 9 8 5
 */

package boletin_matrices;

public class ejercicio11 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}};
        int[][] matriz2 = {{7,8,9}, {10,11,12}};

        boolean esInversa = comprobarEsInversa(matriz, matriz2);
        if (esInversa) {
            System.out.println("Es inversa");
        } else {
            System.out.println("No es inversa");
        }
    }

    private static boolean comprobarEsInversa (int[][] matriz, int[][] matriz2) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != matriz2[matriz2.length -1 -i][matriz2.length -1 -j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
