package boletin2;

import java.util.Scanner;

public class ejercicio2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, resto, oremun;
        oremun = 0;

        System.out.println("Introduce un número entero y que sea positivo");
        numero = Integer.parseInt(sc.nextLine());
        sc.close();

        while (numero > 0) {
            resto = numero % 10;
            numero = numero / 10;
            oremun *= 10;
            oremun += resto;
        }

        System.out.printf("El número espejo %d de es %d", numero, oremun);

    }
}
