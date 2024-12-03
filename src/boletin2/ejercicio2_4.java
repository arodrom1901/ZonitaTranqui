package boletin2;

import java.util.Scanner;

public class ejercicio2_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int h1, m1, s1;
        int sumah1, sumam1, sumas1, resh1, resm1, ress1;
        System.out.println("Pon una hora");
        h1 = entrada.nextInt();
        System.out.println("Pon un minuto");
        m1 = entrada.nextInt();
        System.out.println("Pon un segundo");
        s1 = entrada.nextInt();
        System.out.println("¿Cuantas horas quieres sumar?");
        sumah1 = entrada.nextInt();
        System.out.println("¿Cuantos minutos quieres sumar?");
        sumam1 = entrada.nextInt();
        System.out.println("¿Cuantos segundos quieres sumar?");
        sumas1 = entrada.nextInt();

        while (s1 >= 60); {
            m1 = m1 + 1;
            s1 = s1 - 60;
        }

        while (m1 >= 60); {
            h1 = h1 + 1;
            m1 = m1 - 60;
        }

        resh1 = h1 + sumah1;
        resm1 = m1 + sumam1;
        ress1 = s1 + sumas1;

        System.out.println("La hora final es "+resh1+":"+resm1+":"+ress1);

    }
}
