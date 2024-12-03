package boletin_arrays;

import java.util.Arrays;

public class ejercicio10 {
    public static void main(String[] args) {
            int[] array = {1,2,2,3,4,5,5,6,7};

            int[] array2 = eliminarDuplicados(array);

            System.out.println(Arrays.toString(array));
    }
    private static int buscarNumero (int[] buscar, int numero) {
        for (int i = 0; i < buscar.length; i++) {
            if (buscar[i] == numero){
                return i;
            }
        }
        return -1;
    }
    private static int[] eliminarDuplicados(int[] array) {
        int[] array2 = new int[array.length];
        int indiceCopia = 0;
        for (int i = 0; i <array.length; i++) {
            if (buscarNumero(array2, array[i]) == -1) {
                array2[indiceCopia] = array[i];
                indiceCopia++;
            }
        }
        return array2;
    }
}
