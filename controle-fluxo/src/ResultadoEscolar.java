public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

        // Condicionais padrão

        // if(nota >= 7)
        // System.out.println("Parabéns! Você está aprovado");

        // else if(nota >=5 && nota<7)
        // System.out.println("Ops, você está de recuperação");

        // else
        // System.out.println("Infelizmente você foi reprovado");
    }
}