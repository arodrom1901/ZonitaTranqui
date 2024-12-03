package boletin_arrays;

import java.util.Arrays;

public class ejercicio12 {
    public static void main(String[] args) {

        int[] array = {9, 7, 5, 8, 6, 2, 3, 1, 4};
        ordenaBurbuja(array);
        System.out.println(Arrays.toString(array));
    }

    public static void ordenaBurbuja(int[] array) {
        int temporal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) { // Al principio j se refiere a la posición 1, mientrs i se refiere a 0
                    temporal = array[j]; // Guardo en el temporal el valor del primer elemento
                    array[j] = array[j+1]; // El primer elemento toma el valor del segundo
                    array[j+1] = temporal; // El segundo elemento toma el valor del primero elemento
                }
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
