package Modulo1.ProjetoSmartTV;

/*
        Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
        Ela tenha as características: ligada (boolean), canal (int) e volume (int);
        Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
        Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
        Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.

 */
public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentar o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentar o canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuir o canal para: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudar o canal para: " + canal);
    }
}
