package boletin1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;

        do {
            System.out.println("Introduce un número para la base");
            base = sc.nextInt();
        } while (base < 0);

        do {
            System.out.println("Introduce otro número para el exponente");
            exponente = sc.nextInt();
        } while (exponente < 0);

        sc.close();

        int acumulador =1;

        for (int i=1; i<=exponente; i++){
            acumulador= acumulador*base;
        }

        System.out.println(base+ " elevado a " +exponente+ " es igual a " +acumulador);
    }
}