
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 150.0;
       double valorSolicitado = 726.78;

       if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: "+saldo);
       }
        else{
            System.out.println("Desulpe, mas seu saldo é insuficiente");
        }

        

    }
}