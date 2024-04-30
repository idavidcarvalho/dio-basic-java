public class Operadores {
    public static void main(String[] args) {

        // O = é operador de atribuição server para atribuirmos valores a variáveis
        int numero = 4;
        boolean verdade = true;

        /*
         * O operador aritmético, é utilizado para realizar operações matemáticas entre
         * valores numéricos, podendo se tornar ou não uma expressão mais complexa.
         */

        // + realiza uma soma
        int soma = numero + 1;
        // - realiza uma subtração
        int subrtracao = numero - 1;
        // * realiza uma multiplicação
        int multiplicacao = numero * 2;
        // O / realiza uma divisão
        int divisão = numero / 2;
        // % realiza o módulo (resto da divisão)
        int restoDivisao = numero % 3;

        /*
         * Opearedoes unários servem incrementar, decrementar, inverter valores
         * numéricos e booleanos.
         * unário positvo: +
         * unário negativo: -
         * unário incremento: ++
         * unário decremento: --
         * unário negação: !
         */
        int unarioNegativo = -numero;
        int unarioPosistivo = +numero;
        int unarioIcremento = ++numero;
        int unarioDecremento = --numero;
        boolean unarioNegacao = !verdade;

        /*
         * O operador ternário '?' é uma forma resumida para definir uma condição e
         * escolher por um dentre dois valores.
         */

        int a, b;

        a = 5;
        b = 6;

        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);

        /*
         * Os operadores relacionais, avaliam a relação entre duas variáveis ou
         * expressões
         * 
         * == Verifica se uma variável é IGUAL a outra
         * != Verifica se uma variável é DIFERENTE de outra
         * > Verifica se uma variável é MAIOR que outra
         * >= Verifica se uma variável é MAIOR OU IGUAL que outra
         * < Verifica se uma variável é MENOR que outra
         * <= Verifica se uma variável é MENOR OU IGUAL que outra
         */

        // classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        Integer numero3 = 9;
        Integer numero4 = 9;

        if (numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        // Quando queremos comparar objetos, usamos o método equals ao invés de ==
        System.out.println(numero3.equals(numero4));

        /*
         * Os operadores lógicos, representam o recurso que nos permite criar expressões
         * lógicas maiores, a partir da junção de duas ou mais expressões.
         * 
         * && Operador Lógico "E"
         * || Operador Lógico "OU"
         */

        // Operadores.java
        boolean condicao1 = true;

        boolean condicao2 = false;

        /*
         * Aqui estamos utilizando o operador lógico E para fazer a união de duas
         * expressões.
         * É como se estivesse escrito:
         * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */

        if (condicao1 && condicao2) {
            System.out.print("Os dois valores precisam ser verdadeiros");

        }

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2) {
            System.out.print("Um dos valores precisa ser verdadeiro");
        }
    }
}
