package Modulo2.Desafios.ControleFluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = scanner.nextInt();

        scanner.close();

        //Método
        contar(parametro1, parametro2);

        }catch (ParametrosInvalidosException e){
            //System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            System.out.println(e.getMessage());
        }


    }


    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        int contagem = parametro2 - parametro1;

        if(contagem < 0){
            throw new ParametrosInvalidosException();
        }

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o numero " + i);
        }


    }
}
