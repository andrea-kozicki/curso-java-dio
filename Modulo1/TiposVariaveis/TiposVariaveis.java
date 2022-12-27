package Modulo1.TiposVariaveis;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double PI = 3.14;
        System.out.println(PI);
    }
}
