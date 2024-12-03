package boletin1;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero1 = sc.nextInt();

        sc.close();

        int cifras = 0;

        while (numero1 != 0) {
            cifras++;
            numero1 = numero1 / 10;
        }
            System.out.println("El número tiene " + cifras + " cifras");

    }
}
