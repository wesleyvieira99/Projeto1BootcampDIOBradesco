import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e capturando dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu Nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem formatada
        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo
        );

        System.out.println(mensagem);

        // Fechando o scanner
        scanner.close();
    }
}
