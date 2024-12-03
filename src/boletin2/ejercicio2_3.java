package boletin2;

import java.util.Scanner;

public class ejercicio2_3 {
    public static void main(String[] args) {
        final int M = 1000;
        final int D = 500;
        final int C = 100;
        final int L = 50;
        final int X = 10;
        final int V = 5;
        final int I = 1;

        Scanner sc = new Scanner(System.in);
        String numromano;
        int acumulado = 0;
        int temporal = 0;
        int anterior = Integer.MAX_VALUE;

        System.out.print("Introduce el número romano: ");

        numromano = sc.nextLine();

        for (int i = 0;  i < numromano.length(); i++) {
            char letraactual = numromano.charAt(i);
            int valordeletra = 0;
            switch (letraactual) {
                case 'M': {
                    valordeletra = M;
                    break;
                }
                case 'D': {
                    valordeletra = D;
                    break;
                }
                case 'C': {
                    valordeletra = C;
                    break;
                }
                case 'L': {
                    valordeletra = L;
                    break;
                }
                case 'X': {
                    valordeletra = X;
                    break;
                }
                case 'V': {
                    valordeletra = V;
                    break;
                }
                case 'I': {
                    valordeletra = I;
                    break;
                }
            }
            if (valordeletra < anterior) {
                if (temporal > 0) {
                    acumulado += temporal;
                }
                temporal = valordeletra;
            } else if (valordeletra == anterior) {
                acumulado += temporal + valordeletra;
                temporal = 0;
            }
            else {
                acumulado += valordeletra - temporal;
                temporal = 0;
            }
            anterior = valordeletra;
        }
        if (temporal > 0) {
            acumulado += temporal;
        }
        System.out.printf("El número %s en decimal es %d", numromano, acumulado);
    }
}
