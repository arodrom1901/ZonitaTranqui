package boletin_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el tamaño del array");
        creaArray(sc.nextInt());
        sc.close();
    }

    public static void creaArray (int tamano) {
        int [] array = new int [tamano];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1001);
        }

        System.out.println(Arrays.toString(array));
    }
}
