package Modulo2.EstruturasExcecoes;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("2312356");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e){
            //e.printStackTrace();
            System.out.println("O CEP não corresponde com a regra do negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();
            //simulando um cep formatado
            return "23.123-546";

    }
}
