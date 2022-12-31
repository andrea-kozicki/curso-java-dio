package Modulo2.EstruturasRepeticao;

import java.util.concurrent.ThreadLocalRandom;
public class RepeticaoWhile {

    public static void main(String[] args) {

        double mesada = 50.0;
        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;

            }
            System.out.println("Valor de R$ " + valorDoce + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Sobrou R$: " + mesada + " da mesada.");

    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
