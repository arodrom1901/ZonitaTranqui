package boletin1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de alumnos");
        int n = Integer.parseInt(sc.nextLine());
        while (n < 1){
            System.out.println("¿Cómo van a haber "+n+" alumnos, flipao?");
            System.out.println("Dilo bien ahora, anda. ¿Cuántos alumnos hay?");
            n = Integer.parseInt(sc.nextLine());
        }
        int i = 0;
        float nota;
        int apro = 0;
        int susp = 0;

        System.out.println("Nota de cada alumno");
        do {
            i++;
            System.out.println("Alumno nº " + i);
            nota = Float.parseFloat(sc.nextLine());
            if (nota >= 5){
                apro++;
            } else {
                susp++;
            }
        } while (i < n);
        System.out.println("Han aprobado " + apro + " alumnos");
        System.out.println("Han suspendido " + susp + " alumnos");
        float porc = (float) apro / n * 100;
        System.out.printf("El porcentaje de aprobados es de %.2f%%", porc);
        //al usar %.2f nos dará solo 2 decimales aunque el número tenga más,  usando también *float* o *double*.
    }
}
