package Modulo1.Desafios;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //Criaçao dos objetos
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados utilizando a classe scanner
        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();


        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();


        System.out.println("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();


        System.out.println("Por favor, digite o saldo da conta: ");
        float saldo = scanner.nextFloat();

        //Mensagem a ser exibida
        System.out.println("Olá " + nome + " obrigado(a) por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
