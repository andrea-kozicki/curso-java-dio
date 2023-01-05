package Modulo2.Desafios.ControleFluxo;

public class ParametrosInvalidosException extends Exception{

    @Override
    public String getMessage() {
        return "Ordem crescente dos argumentos incorreta.";
    }
}
