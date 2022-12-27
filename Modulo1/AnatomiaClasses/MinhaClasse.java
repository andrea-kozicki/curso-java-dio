package Modulo1.AnatomiaClasses;
public class MinhaClasse {

    public static void main(String[] args) {

        System.out.println("Minha primeira classe.");

        String meuNome = "Andréa";
        int anoNascimento = 1985;
        boolean verdadeira = false;

        String primeiroNome = "Andréa";
        String segundoNome = "Kozicki";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(meuNome);
        System.out.println(anoNascimento);
        System.out.println(verdadeira);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
