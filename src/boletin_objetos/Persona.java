package boletin_objetos;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String DNI;
    public char sexo;
    public float altura;
    public float peso;

    public Persona(String nombre, int year, int month, int day, int DNI, char sexo, float altura, float peso) throws PersonaException {

        this.setNombre(nombre);
        this.setFechaNacimiento();
        this.setDNI(DNI);
        this.setSexo(sexo);
        this.setAltura(altura);
        this.setPeso(peso);
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

    public void setFechaNacimiento(int year, int month, int day) throws PersonaException {

        this.fechaNacimiento = LocalDate.of(year, month, day);
        if (year > 2024 || year <  1924) {

            throw new PersonaException("No puedes poner esa cantidad");
        } else if (month > 12 || month < 1) {

            throw new PersonaException("No puedes introducir esa cantidad");
        } else if (day > 31 || day < 1) {

            throw new PersonaException("No puedes insertar esa cantidad");
        }
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

    public char getletraDNI() {

        int letrDNI;
    }

    public char getSexo() {

        return sexo;
    }

    public void setSexo(char sexo) {

        this.sexo = sexo;
    }

    public float getAltura() {

        return altura;
    }

    public void setAltura(float altura) {

        this.altura = altura;
    }

    public float getPeso() {

        return (float) (peso / Math.pow(altura, 2));
    }

    public void setPeso(float peso) {

        this.peso = peso;
    }
}
}
