package boletin_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ordenaBurbujaMenorMayor(array);

        System.out.println("¿Lo quieres de menor a mayor?");
        String respuesta = sc.next();

        if (respuesta == "si") {
            System.out.println(Arrays.toString(array));
        } else {

            ordenaBurbujaMayorMenor(array);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void ordenaBurbujaMenorMayor(int[] array) {
        int temporal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) { // Al principio j se refiere a la posición 1, mientrs i se refiere a 0
                    temporal = array[j]; // Guardo en el temporal el valor del primer elemento
                    array[j] = array[j + 1]; // El primer elemento toma el valor del segundo
                    array[j + 1] = temporal; // El segundo elemento toma el valor del primero elemento
                }
            }
        }
    }
    public static void ordenaBurbujaMayorMenor(int[] array) {
        int temporal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) { // Al principio j se refiere a la posición 1, mientrs i se refiere a 0
                    temporal = array[j]; // Guardo en el temporal el valor del primer elemento
                    array[j] = array[j + 1]; // El primer elemento toma el valor del segundo
                    array[j + 1] = temporal; // El segundo elemento toma el valor del primero elemento
                }
            }
        }
    }
}