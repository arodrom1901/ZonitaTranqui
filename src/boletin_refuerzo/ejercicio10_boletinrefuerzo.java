package boletin_refuerzo;

import java.util.Scanner;

public class ejercicio10_boletinrefuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una altura para el arbol de navidad");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {

            for (int j  = 0; j < altura -1 -i; j++) {


                System.out.print(" ");
            }
                for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
