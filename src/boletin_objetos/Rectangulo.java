/* 1. Crear una clase Rectangulo con los atributos
longitud y ancho, cada uno con un valor predeterminado
igual a 1. Proporcionar los metodos set y get para los
atributos longitud y ancho respectivamente. El metodo set
debe verificar que longitud y ancho contengan números
reales mayores que cero y menores que 20.
Además, proporcionar metodos que calculen el perímetro
y el área del rectángulo. Escribir un metodo main que
solicite los datos de un rectángulo y muestre cual es
su área y su perímetro. Probar a introducir un dato
incorrecto (mayor o igual que 20).
*/

package boletin_objetos;

public class Rectangulo {

    private int longitud;
    private int ancho;
//Le damos valor a longitud y ancho
    public Rectangulo() {

        this.longitud = 1;
        this.ancho = 1;
    }
//Creamos los metodos get y set para el atributo longitud
    public int getLongitud(){

        return longitud;
    }

    public void setLongitud(int longitud) throws RectanguloException {

        if (longitud > 0 && longitud < 20) {

            throw new RectanguloException("La longitud no es correcta");
        }
        this.longitud = longitud;
    }

//Creamos los metodos get y set para el atributo ancho

    public int getAncho() {

        return ancho;
    }

    public void setAncho(int ancho) throws RectanguloException {

        if (ancho > 0 && ancho < 20) {

            throw new RectanguloException("El ancho no es correcto");
        }
        this.ancho = ancho;
    }

    public static int calcularPerimetro(int longitud) {


        return longitud;
    }

}