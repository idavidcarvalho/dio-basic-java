public enum EstadosBrasileiros {
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte","RN");
    
    
    private String nome;
    private String sigla;


    private EstadosBrasileiros (String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo(){
        return this.nome.toUpperCase();
    }






}
