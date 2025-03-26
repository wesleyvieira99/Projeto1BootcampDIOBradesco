import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // Entradas das três transações
        double trx1 = scanner.nextDouble();
        double trx2 = scanner.nextDouble();
        double trx3 = scanner.nextDouble();
        
        List<Double> transacoes = Arrays.asList(trx1, trx2, trx3);

        // Cálculo do saldo final
        double saldoFinal = saldoInicial;
        for (int i = 0; i < transacoes.size(); i++) {
            saldoFinal += transacoes.get(i);
        }
        
        // Saída formatada do saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
