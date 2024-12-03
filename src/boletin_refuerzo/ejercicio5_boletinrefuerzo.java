package boletin_refuerzo;

import java.util.Scanner;

public class ejercicio5_boletinrefuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un grado en Fahrenheit");
        float grados = sc.nextInt();
        float resultado = (grados - 32)*5/9;
        System.out.println("Los "+grados+"ºF en Fahrenheit son "+resultado+"ºC en Celsius");
    }
}
