package boletin1;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numvidas = 5;
        int aleatorio = (int) (Math.random() * 100) + 1;

        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();
            if (num < aleatorio && num > 1 && num < 100) {
                System.out.println("Te has quedao corto");
            } else if (num > aleatorio && num > 1 && num < 100) {
                System.out.println("Te has pasao");
            } else if (num < 1 || num >100) {
                System.out.println("Illo, es un número entre el 1 al 100");
            }
            numvidas--;
        } while (numvidas > 0 && num != aleatorio);
        sc.close();
        if (num == aleatorio) {
            System.out.println("Ganaste fiera");
        } else
            System.out.println("Madre mía que malo eres");
    }
}
