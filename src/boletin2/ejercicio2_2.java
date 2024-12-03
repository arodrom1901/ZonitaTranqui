package boletin2;

import java.util.Scanner;

public class ejercicio2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, numerooriginal, resto, oremun;

        oremun = 0;
        System.out.println("Introduce un número entero y que sea positivo");
        numero = Integer.parseInt(sc.nextLine());
        numerooriginal = numero;
        sc.close();

        while (numero > 0) {
            resto = numero % 10;
            numero = numero / 10;
            oremun = oremun * 10;
            oremun = oremun + resto;
        }
        if (numerooriginal == oremun) {
            System.out.printf("El número %d es capicúa", numerooriginal);
        }
        else {
            System.out.printf("El número %d no es capicúa", numerooriginal);
        }
    }
}
