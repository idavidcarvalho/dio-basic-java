public class SmartTv {
    boolean ligada = false;
    int canal = 4;
    int volume = 30;


    //Estado
    public void ligar(){
        ligada = true;
    }

    public void deligar(){
        ligada = false;
    }

    //Volume
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+volume);

    }
    public void diminuirVolume (){
        volume--;
        System.out.println("Diminuindo o volume para: "+volume);

    }

    //Canal
    public void mudarCanal (int canalDesejado){
        canal = canalDesejado;
        System.out.println("Mudando para o canal: "+canal);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: "+canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: "+canal);

    }
}
