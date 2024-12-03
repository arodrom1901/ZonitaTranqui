/*
1. Crea un metodo
que compruebe si en una
matriz hay algún valor negativo, y devuelva un
valor booleano.
 */

package boletin_matrices;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int[][] matrizCreada = matriz();
        boolean negativos = hayNegativos(matrizCreada);
        if (negativos) {
            System.out.println("Hay números negativos");
        } else {
            System.out.println("No hay números negativos");
        }
    }

    public static int[][] matriz() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Creamos una matriz");
        System.out.print("Introduzca el valor en filas:");
        int size_filas = sc.nextInt();
        System.out.print("Introduzca el valor en columnas:");
        int size_columnas = sc.nextInt();

        int[][] sizeMatriz = new int[size_filas][size_columnas];

        for (int i = 0;i < sizeMatriz.length; i++) {
            for (int j = 0;j < sizeMatriz[i].length; j++) {
                System.out.print("Introduzca los elementos de la matriz");
                int elementos = sc.nextInt();
                sizeMatriz[i][j] = elementos;
            }
        }


        for (int i = 0;i < sizeMatriz.length; i++) {
            for (int j = 0;j < sizeMatriz[i].length; j++) {
                System.out.print(sizeMatriz[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
        return sizeMatriz;
    }

    public static boolean hayNegativos(int[][] matrizCreada) {
        for (int i = 0;i < matrizCreada.length; i++) {
            for (int j = 0;j < matrizCreada[i].length; j++) {
                if (matrizCreada[i][j] < 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
