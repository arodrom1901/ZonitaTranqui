package boletin_refuerzo;

import java.util.Scanner;

public class ejercicio2_boletinrefuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binario;

        System.out.println("Introduce un número binario");
        binario = sc.nextLine();

        StringBuilder sb = new StringBuilder(binario);
        String binarioinvertido = sb.reverse().toString();
        int resultado = 0;

        for (int i = 0; i < binarioinvertido.length(); i++) {
            resultado += Integer.parseInt(binarioinvertido.charAt(i) + "") * Math.pow(2, i);

        }
        System.out.printf("El número binario "+ binario +" es en decimal "+ resultado);
    }
}
