package Modulo1.Operadores;

import java.util.Date;

public class OperadoresDeclaracao {

    public static void main(String[] args) {

        //Atribuição
        String nome = "Andrea";
        int idade = 37;
        double peso = 62.5;
        char sexo = 'F';
        boolean doadorOrgao = true;
        Date dataNascimento = new Date();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(sexo);
        System.out.println(doadorOrgao);
        System.out.println(dataNascimento);

        //Aritméticos
        double soma = 4.3 + 12.4;
        int subtracao = 110 - 13;
        int multiplicacao = 20 * 4;
        int divisao = 4 / 2;
        int modulo = 18 % 3;
        double resultadoExpressao = (34 * 5) + (21 / 3.4);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultadoExpressao);

        //Concatenação
        String nomeLinguagem = "LINGUAGEM " + "JAVA";
        System.out.println(nomeLinguagem);

        String concatenacao ="?";
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //Unários
        int algarismo = 6;

        algarismo = - algarismo;
        System.out.println(algarismo);

        algarismo = algarismo * -1;
        System.out.println(algarismo);

        algarismo++;
        System.out.println(algarismo);

        ++algarismo;
        System.out.println(algarismo);

        algarismo--;
        System.out.println(algarismo);

        --algarismo;
        System.out.println(algarismo);

        //Booleanos

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        variavel =!variavel;
        System.out.println(variavel);
        System.out.println(!variavel);

        //Ternário
        int a = 4;
        int b = 6;
        String resultado = a==b?"verdadeiro":"falso";
        System.out.println(resultado);

        a = 6;
        resultado = a==b?"verdadeiro":"falso";
        System.out.println(resultado);

        int c = 5;
        int d = 2;
        int resultado1 = c==d? 1 : 0;
        System.out.println(resultado1);

        //Relacionais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero1 é igual a Numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero1 é igual a Numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero1 é maior que Numero2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("Numero1 é menor que Numero2? " + simNao);

        if(numero1 == numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        numero1 = numero2;
        if(numero1 == numero2){
            System.out.println("A condição agora é verdadeira");
        }

        //Relacionais usando Strings pelo método equals
        String nome1 = "Andrea";
        String nome2 = "Andrea";

        System.out.println(nome1 == nome2);

        nome2 = new String("Andrea");
        System.out.println(nome1.equals(nome2));

        nome2 = new String("Paula");
        System.out.println(nome1.equals(nome2));

        //Lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 && (7>3)){
            System.out.println("As duas condições são verdadeiras");
        }

        condicao2 = condicao1;
        if (condicao1 && condicao2){
            System.out.println("Agora as condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Qualquer uma das condições é verdadeira");
        }
    }
}
