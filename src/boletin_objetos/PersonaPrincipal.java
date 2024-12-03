package boletin_objetos;

import java.util.Scanner;

public class PersonaPrincipal {
    public static void main(String[] args) throws PersonaException {

        Persona objetoPersona = new Persona();
        Scanner sc = new Scanner(System.in);
        int DNI;
        float altura;
        float peso;
        boolean parametroCorrecto = false;
        int year;
        int month;
        int day;
        System.out.println("Dime el dia en el que naciste");
        day = sc.nextInt();
        System.out.println("Dime el mes en el que naciste");
        month = sc.nextInt();
        System.out.println("Dime el año en el que naciste");
        year = sc.nextInt();
        objetoPersona.setFechaNacimiento(year, month, day);
    }
}