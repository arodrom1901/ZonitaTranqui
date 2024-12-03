package boletin_refuerzo;

public class ejemplo {
    public static void main(String[] args) {
        double d = Math.random();

        d = d * 100;
    }

    public static int numeroaleatorio(int limiteinferior, int limitesuperior) {
        double d = Math.random();
        int numalet = (int) (d * (limitesuperior - limiteinferior)) + limiteinferior;
        return numalet;
    }
}
