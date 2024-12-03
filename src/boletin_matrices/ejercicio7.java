/*
7. Crea un metodo que reciba
dos matrices, y compruebe si son exactamente iguales.
 */

package boletin_matrices;

public class ejercicio7 {
    public static void main(String[] args) {

        int[][] matriz = {{1,2,3}, {4,5,6}};
        int[][] matriz2 = {{1,2,3}, {4,5,6}};

        boolean mismoTamano = compruebaTamano(matriz, matriz2);
        boolean mismoValores = comprobarValores(matriz, matriz2);

        if (mismoTamano && mismoValores) {

            System.out.println("Las dos matrices son iguales");

        } else if (mismoTamano && !mismoValores){

            System.out.println("Tienen el mismo tamaño pero distintos valores");

        } else {

            System.out.println("Las matrices son distintas por completo");
        }
    }

    private static boolean compruebaTamano(int[][] matriz, int[][] matriz2) {

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

    private static boolean comprobarValores(int[][] matriz, int[][] matriz2) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] != matriz2[i][j]) {

                    return false;
                }
            }
        }
        return true;
    }
}
