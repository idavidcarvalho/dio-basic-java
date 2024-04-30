/**
 * <h1>Calculadora Básica</h1>
 * Esta calculadora báisca realiza as quatro operações matemáticas entre números
 * inteiros
 * <p>
 * <b>Nota:</b> Leia com atenção a documentação desta classe
 * para usufruir dos recursos oferecidos pelo autor
 *
 * @author David Carvalho
 * @version 1.0
 * @since 30/04/2024
 */
public class Calculadora {

    /**
     * Este método é utilizado para multiplicar dois números inteiros
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a multiplicação de dois números.
     */
    public int multiplicar(int numeroUm, int numeroDois) {
        return numeroUm * numeroDois;
    }

    /**
     * Este método é utilizado para somar dois números inteiros
     * 
     * @param numeroTres   este é o primeiro parâmetro do método
     * @param numeroQuatro este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma de dois números.
     */
    public int somar(int numeroTres, int numeroQuatro) {
        return numeroTres + numeroQuatro;

    }

    /**
     * Este método é utilizado para subtrair dois números inteiros
     * 
     * @param numeroCinco este é o primeiro parâmetro do método
     * @param numeroSeis  este é o segundo parâmetro do método
     * @return int o resultado deste método é a subtração de dois números.
     */
    public int subtrair(int numeroCinco, int numeroSeis) {
        return numeroCinco - numeroSeis;
    }

    /**
     * Este método é utilizado para dividir dois números inteiros
     * @param numeroSete este é o primeiro parâmetro do método
     * @param numeroOito  este é o segundo parâmetro do método
     * @return int o resultado deste método é a divisão de dois números.
     */
    public int dividir(int numeroSete, int numeroOito) {
        return numeroSete / numeroOito;
    }
}
