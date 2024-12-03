package boletin_refuerzo;

import java.util.Scanner;

public class ejercicio6_boletinrefuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un grado en Celsius");
        float grados = sc.nextInt();
        float resultado = (grados *9/5)+32;
        System.out.println("Los "+grados+"ºC en Celsius son "+resultado+"ºF en Fahrenheit");
    }
}