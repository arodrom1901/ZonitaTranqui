package boletin_arrays;

import java.util.Arrays;

public class ejercicio11 {
    public static void main(String[] args) {

        int[] arrayA = {3,5,2,6,5,7};

        int[] arrayB = {5,1,9,8,2};

        int[] arrayC = elementosComunes(arrayA, arrayB);
        System.out.println(Arrays.toString(arrayC));

//___________________________________________________________________________________________________

    }

    public static int[] elementosComunes(int[] arrayA, int[] arrayB){
        int[] arrayC = new int[arrayA.length];
        int elementosarrayC = 0;

        for (int i = 0;i < arrayA.length; i++) {
            if (buscarElemento(arrayB, arrayA[i]) && !buscarElemento(arrayC, arrayA[i])) {
                arrayC[elementosarrayC] = arrayA[i];
                elementosarrayC++;
            }
        }

        int[] arrayTamExacto = new int[elementosarrayC];
        for (int i = 0;  i < elementosarrayC; i++) {
            arrayTamExacto[i] = arrayC[i];
        }

        return arrayTamExacto;
    }

    private static boolean buscarElemento(int[] array, int num) {
        boolean encontrado = false;

        for (int i = 0; i < array.length && !encontrado; i++) {
            if (array[i] == num) {
                encontrado = true;
            }
        }
        return encontrado;
    }
}