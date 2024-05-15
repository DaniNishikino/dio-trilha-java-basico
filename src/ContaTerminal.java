import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("CONTA BANCARIA");
        System.out.println("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o numero da agência: ");
        String numeroAgencia = sc.next();
        sc.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agencia é " +
                numeroAgencia + ", conta " + numeroConta + " e seu saldo para saque é " + saldo);

    }
}
