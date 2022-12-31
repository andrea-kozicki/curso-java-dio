package Modulo2.EstruturasRepeticao;

public class ForArrays {

    public static void main(String[] args) {
        String alunos[] = {"ANDREA", "LUCAS", "RENATA", "CAMILO", "VICTOR"};

        for (int posicao = 0; posicao < alunos.length; posicao++){
            System.out.println("A posição " + posicao + " é ocupada pelo aluno(a) " + alunos[posicao]);
        }
    }
}
