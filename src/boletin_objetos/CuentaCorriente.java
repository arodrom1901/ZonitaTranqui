/*
2. Realizar un programa que permita gestionar
el saldo de una cuenta corriente. Una vez
introducido el saldo inicial, se mostrará un
menú que permitirá efectuar las siguientes operaciones:
1. Hacer un reintegro, se pedirá la cantidad a retirar.
2. Hacer un ingreso, se pedirá la cantidad a ingresar.
3. Consultar el saldo y el número de reintegros e ingresos
realizados.
4. Finalizar las operaciones. Debe confirmar si realmente desea
salir e informar del saldo al final de todas las operaciones.
 */

package boletin_objetos;

public class CuentaCorriente {

   private String numeroCuenta;
   private String titular;
   private double saldo;

    public CuentaCorriente(String numeroCuenta,  String titular, double saldoInicial) throws CuentaException {

        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.setSaldo(saldoInicial);
    }

    private void setSaldo(double saldo) throws CuentaException {

        if (saldo < 0) {

            throw new CuentaException("El saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }
}
