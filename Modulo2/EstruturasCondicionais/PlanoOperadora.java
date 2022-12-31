package Modulo2.EstruturasCondicionais;

public class PlanoOperadora {

    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T":{
                System.out.println("5Gb YouTube");
            }
            case "M":{
                System.out.println("Whatsapp + Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
