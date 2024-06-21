package componentes.iphone;

import componentes.navegador.NavegadorInternet;
import componentes.reprodutor.ReprodutorMusica;
import componentes.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusica, AparelhoTelefonico, NavegadorInternet {

    public void selecionarMusica(String musica) {
        System.out.println("Musica: "+musica+" selcionada");

    }

    public void tocar() {
       System.out.println("Tocando música");

    }

    public void pausar() {
        System.out.println("Música pausada");

    }

    public void atender() {
        System.out.println("Ligação atendida");

    }

    public void ligar(String numero) {
        System.out.println("Ligando para "+numero);

    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");

    }

    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba");

    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: "+url);

    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");

    }

}
