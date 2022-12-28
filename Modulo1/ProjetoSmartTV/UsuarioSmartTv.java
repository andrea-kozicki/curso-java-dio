package Modulo1.ProjetoSmartTV;

public class UsuarioSmartTv {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual é o canal em que ela está sintonizada? " + smartTv.canal);
        System.out.println("Qual é o volume atual? " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        System.out.println("Qual é o volume atual? " + smartTv.volume);
        System.out.println("Qual é o canal em que ela está sintonizada? " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        System.out.println("Qual é o volume atual? " + smartTv.volume);
        System.out.println("Qual é o canal em que ela está sintonizada? " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Qual é o canal em que ela está sintonizada? " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Qual é o volume atual? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Qual é o canal em que ela está sintonizada? " + smartTv.canal);

        smartTv.desligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);
    }
}
