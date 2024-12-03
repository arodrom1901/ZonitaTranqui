package boletin_objetos;

import java.util.Scanner;

public class PersonaPrincipal {
    public static void main(String[] args) throws PersonaException {

        Persona objetoPersona = new Persona();
        Scanner sc = new Scanner(System.in);
        String numerosDNI;
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

        do {

            try {

                System.out.println("Introduce los numeros del DNI");
                numerosDNI = sc.next();
                objetoPersona.setDNI(numerosDNI);
                parametroCorrecto = true;
            } catch (PersonaException e) {

                System.out.println(e.getMessage());
            }
        } while (!parametroCorrecto);
        parametroCorrecto = false;
        do {

            try {

                System.out.println("Ahora, introduce tu altura");
                altura = sc.nextFloat();
                objetoPersona.setAltura(altura);
                parametroCorrecto = true;
            } catch (PersonaException e) {

                System.out.println(e.getMessage());
            }
        } while (!parametroCorrecto);

        parametroCorrecto = false;
        do {

            try {

                System.out.println("Por ultimo, introduce tu peso");
                peso = sc.nextFloat();
                objetoPersona.setPeso(peso);
                parametroCorrecto = true;
            } catch (PersonaException e) {

                System.out.println(e.getMessage());
            }
        } while (!parametroCorrecto);

        System.out.println("La letra del DNI proporcionado es "+objetoPersona.letraDNI());
        System.out.println("El IMC es "+objetoPersona.getIMC());
        System.out.println("Tu fecha de nacimiento es "+objetoPersona.getFechaNacimiento());
    }
}