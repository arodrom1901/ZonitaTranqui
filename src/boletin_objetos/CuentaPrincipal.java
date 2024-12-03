package boletin_objetos;

public class CuentaPrincipal {

    public static void main(String[] args) {

        try {
            CuentaCorriente c1 = new CuentaCorriente("1234", "Juanito", 10);
        } catch (CuentaException e) {

            System.out.println(e.getMessage());
        }
    }
}
