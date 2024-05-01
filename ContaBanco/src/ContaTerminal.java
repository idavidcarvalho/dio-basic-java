import java.util.Scanner;
/**
 * <h1>Conta Terminal</h1>
 * <p>
 * Este projeto simula uma conta bancária através do Terminal/Console
 * e tem o intuito de por em prática os conhecimentos básicos da linguagem java
 * <p>
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n##### Conta Terminal #####");
        System.out.println("\nDigite seu nome: ");
        nomeCliente = scanner.next();
        System.out.println("Digite o número da Agência: ");
        agencia = scanner.next();
        System.out.println("Digite o número da conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo R$ "+saldo+" já está disponível para saque");
    }
}
