package boletin_objetos;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String DNI;
    public char sexo;
    public float altura, peso;

    public Persona() {

    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {

        return fechaNacimiento;
    }

    public void setFechaNacimiento(int year, int month, int day) {

        this.fechaNacimiento = LocalDate.of(year, month, day);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws PersonaException {
        if (peso <= 0) {
            throw new PersonaException("Es imposible que peses 0 o menos");
        }

        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws PersonaException {
        if (altura <= 0) {
            throw new PersonaException("No puede ser que midas 0 o menos");
        }

        this.altura = altura;
    }

    public String getDNI() {

        return DNI;
    }

    public void setDNI(String DNI) throws PersonaException {

        if (DNI.length()!=8) {

            throw new PersonaException("El DNI no puede tener mas de 8 digitos");
        }

        this.DNI = DNI;
    }

    public char letraDNI() {

        int letraDNI = Integer.parseInt(DNI) % 23;
        char letra;

        if (letraDNI == 0) {
            letra = 'T';
        } else if (letraDNI == 1) {
            letra = 'R';
        } else if (letraDNI == 2) {
            letra = 'W';
        } else if (letraDNI == 3) {
            letra = 'A';
        } else if (letraDNI == 4) {
            letra = 'G';
        } else if (letraDNI == 5) {
            letra = 'M';
        } else if (letraDNI == 6) {
            letra = 'Y';
        } else if (letraDNI == 7) {
            letra = 'F';
        } else if (letraDNI == 8) {
            letra = 'P';
        } else if (letraDNI == 9) {
            letra = 'D';
        } else if (letraDNI == 10) {
            letra = 'X';
        } else if (letraDNI == 11) {
            letra = 'B';
        } else if (letraDNI == 12) {
            letra = 'N';
        } else if (letraDNI == 13) {
            letra = 'J';
        } else if (letraDNI == 14) {
            letra = 'Z';
        } else if (letraDNI == 15) {
            letra = 'S';
        } else if (letraDNI == 16) {
            letra = 'Q';
        } else if (letraDNI == 17) {
            letra = 'V';
        } else if (letraDNI == 18) {
            letra = 'H';
        } else if (letraDNI == 19) {
            letra = 'L';
        } else if (letraDNI == 20) {
            letra = 'L';
        } else if (letraDNI == 21) {
            letra = 'K';
        } else {
            letra = 'E';
        }
        return letra;
    }

    public char getSexo() {

        return sexo;
    }

    public void setSexo(char sexo) {

        this.sexo = sexo;
    }

    public double getIMC() {

        return peso / Math.pow(altura, 2);
    }
}
