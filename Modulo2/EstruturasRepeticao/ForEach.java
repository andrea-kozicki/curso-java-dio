package Modulo2.EstruturasRepeticao;

public class ForEach {

    public static void main(String[] args) {
        String alunos[] = {"ANDREA", "LUCAS", "RENATA", "CAMILO", "VICTOR"};

        for (String aluno : alunos ){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
