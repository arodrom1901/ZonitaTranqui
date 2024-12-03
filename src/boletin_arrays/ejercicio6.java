package boletin_arrays;

import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        int[] array = new int[100];
        arrays(array);
        numero(array);
    }

    private static void arrays (int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    private static void numero (int[] array) {
        boolean buscarNumero =false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero a buscar");
        int num = sc.nextInt();
        for (int i = 0; i < array.length && !buscarNumero; i++) {
            if (array[i] == num) {
                buscarNumero = true;
            }
        }
    }
}