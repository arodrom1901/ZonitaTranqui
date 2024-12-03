package boletin1;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        boolean esPrimo = true;
        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();
        } while (num < 0);

        sc.close();
        if (num %2 == 0){
            esPrimo = false;
        }
        for (int i = 3; i < num/2 && esPrimo; i = i+2) {
            System.out.println(i);
            if (num %i == 0){
                esPrimo = false;
            }
        }
        if (esPrimo) {
            System.out.println("El número "+num+" es primo");
        } else {
            System.out.println("El número "+num+" no es primo");
        }
    }
}
