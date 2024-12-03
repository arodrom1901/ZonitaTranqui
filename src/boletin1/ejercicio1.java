package boletin1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime 1º número");
        int n1 = teclado.nextInt();
        System.out.println("Dime 2º número");
        int n2 = teclado.nextInt();
        System.out.println("Dime 3º número");
        int n3 = teclado.nextInt();

        if (n1 >= n2 && n1 >= n3){
            System.out.println(n1 +" es el mayor");
            if (n2 >= n3){
                System.out.println("El orden es "+ n1 +">="+ n2 +">="+ n3);

            }
            else {
                System.out.println("El orden es "+ n1 +">="+ n3 +">="+ n2);
            }
        }
        else if (n2 >= n1 && n2 >= n3){
            System.out.println(n2 +" es el mayor");
            if (n1 >= n3) {
                System.out.println("El orden es "+ n2 +">="+ n1 +">="+ n3);
            }
            else{
                System.out.println("El orden es "+ n2 +">="+ n3 +">="+ n1);
            }
        }
        else {
            System.out.println(n3 +" es el mayor");
            if (n1 >= n2){
                System.out.println("El orden es "+ n3 +">="+ n1 +">="+ n2);
            }
            else {
                System.out.println("El orden es "+ n3 +">="+ n2 +">="+ n1);
            }
        }

    }
}
