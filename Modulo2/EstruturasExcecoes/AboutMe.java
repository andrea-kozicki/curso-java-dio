package Modulo2.EstruturasExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
public class AboutMe {

    public static void main(String[] args) {
        try {

            //criação do objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            //Entrada dos dados

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá. me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser do tipo numérico");
            //Pode ser usado o System.err.println
        }

    }

}