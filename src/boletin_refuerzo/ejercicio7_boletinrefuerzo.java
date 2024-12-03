package boletin_refuerzo;

import java.util.Scanner;

public class ejercicio7_boletinrefuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el número de asteriscos que desees");
        int asteriscos = sc.nextInt();

        for (int i = 0; i < asteriscos; i++) {
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
