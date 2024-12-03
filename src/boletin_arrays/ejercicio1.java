package boletin_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio1 {
    public static void main(String[] args) {
        int[] miarray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(miarray));

        int suma = sumaarray(miarray);

        System.out.printf("La suma del array es de %d", suma);
    }

    public static int sumaarray(int[] miarray) {
        int suma = 0;
        for (int i = 0; i < miarray.length; i++) {
            if (i % 2 == 0) {
                suma += miarray[i];
            }
            System.out.println("La suma de los elementos es " + suma);
        }
        return suma;
    }
}
