import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
public static void main(String[] args) {
	double mesada = 50.0;
    int contDoce = 1;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.printf("Valor do "+contDoce+"º: R$ %.2f %n", valorDoce);
            
            mesada = mesada - valorDoce;
            contDoce++;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(5, 8);
   }
}