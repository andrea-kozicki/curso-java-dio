package Modulo2.EstruturasRepeticao;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Telefone discando...");

        do{

            System.out.println("Tocando Bip...");

        }while (tocando());

        System.out.println("Alô!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
