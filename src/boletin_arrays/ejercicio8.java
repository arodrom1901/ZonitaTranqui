package boletin_arrays;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {1,2,3,4,5,6,7,8,9};
        int resultado = buscarNumero(array, 2);

        System.out.println(resultado);
    }

    private static int buscarNumero (int[] buscar, int numero) {
        for (int i = 0; i < buscar.length; i++) {
            if (buscar[i] == numero){
                return i;
            }
        }
        return -1;
    }
}
