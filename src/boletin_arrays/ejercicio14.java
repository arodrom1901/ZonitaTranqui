package boletin_arrays;

import comun.MiEntradaSalida;

public class ejercicio14 {
    private static int[] cola;
    private static int numElementos;
    public static final int TAMANNO = 0;

    public static void main(String[] args) {
        cola = new int[TAMANNO];
        encolarElementos(7);
        encolarElementos(1);
        encolarElementos(4);
        encolarElementos(2);
        encolarElementos(5);
        encolarElementos(8);
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
    }

    public static void encolarElementos (int n) {
        if (numElementos < TAMANNO) {
            cola[numElementos++] = n;

        } else {
            System.out.println("La cola está llena");
        }
    }

    public static int desencolar() {
        int elementoDevolver = 0;
        if (numElementos == 0) {
            System.out.println("La cola está vacía");
        } else {
            elementoDevolver = cola[0];
            for (int i = 0; i < numElementos - 1; i++) {
                cola[i] = cola[i + 1];
            }
            numElementos--;
        }
        return elementoDevolver;
    }
}
