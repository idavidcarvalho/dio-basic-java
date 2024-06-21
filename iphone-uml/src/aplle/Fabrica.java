package aplle;

import componentes.iphone.Iphone;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Aqualrela");
        iphone.tocar();
        iphone.pausar();

        iphone.atender();
        iphone.ligar("46545616");
        iphone.iniciarCorreioVoz();

        iphone.abrirNovaAba();
        iphone.exibirPagina("google.com");
        iphone.atualizarPagina();


    }
}
