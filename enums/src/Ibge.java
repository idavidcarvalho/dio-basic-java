public class Ibge {
    public static void main(String[] args) {
        for(EstadosBrasileiros uf : EstadosBrasileiros.values()){
            System.out.println(uf.getNome() +" - "+ uf.getSigla());
        }

        EstadosBrasileiros selecionado = EstadosBrasileiros.RIO_GRANDE_DO_NORTE;

        System.out.println("O estado selecionado foi: " +selecionado.getNome());
    }
}
