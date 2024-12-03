package boletin_arrays;

import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        int[] miarray = {23, -15, 31, -4, 17};
        System.out.println(Arrays.toString(miarray));

        int suma = sumaarray(miarray);

        System.out.printf("En total hay %d negativos", suma);
    }

    private static int sumaarray(int[] miarray) {
        int suma = 0;
        for (int i = 0; i < miarray.length; i++) {
            if (miarray[i] < 0) {
                suma++;

            }
        }
        return suma;
    }
}
