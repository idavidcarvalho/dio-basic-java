public class ExemploForArray {
    public static void main(String[] args) {
        String nomes [] = {"Zé", "Fernando", "Julia", "Waldisney"};

        for (int i =0; i<nomes.length; i++) {
            System.out.println("O número "+i+ " é "+ nomes[i]);
        }

        //For Each
        for(String nome : nomes) {
            System.out.println(nome);
          }
    }
}
