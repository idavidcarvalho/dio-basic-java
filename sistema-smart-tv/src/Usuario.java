public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("###### Estado inicial da TV ######");
        System.out.println("A TV está ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        System.out.println("\r\n*****Mexendo na TV*****");
        smartTv.ligar();
        smartTv.mudarCanal(7);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();





        System.out.println("\r\n###### Estado atual da TV ######");
        System.out.println("A TV está ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

    }
}
