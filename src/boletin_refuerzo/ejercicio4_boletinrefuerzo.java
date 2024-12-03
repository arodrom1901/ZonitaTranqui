package boletin_refuerzo;

import java.util.Scanner;

public class ejercicio4_boletinrefuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las caras que tendrá tu dado");
        int n1 = sc.nextInt();
        double aleatorio = (Math.random()*n1)+1;
        int n2 = (int) aleatorio;
        System.out.println("El número que salió fue "+ n2);
    }
}
