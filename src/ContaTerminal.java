import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int numeroDaConta;
        String agencia, nomeCliente;
        Double saldo;

        System.out.print("Por favor, digite o número da conta: ");
        numeroDaConta = scan.nextInt();

        System.out.print("Agência: ");
        agencia = scan.next();

        System.out.print("Nome: ");
        nomeCliente = scan.next();

        System.out.print("Saldo [usar ponto como separador]: ");
        saldo = scan.nextDouble();

        System.out.print("");
        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco! Sua agência é: " + agencia + ", conta: " + numeroDaConta + ", e seu saldo [R$" + saldo + "] já está disponível para saque.");

    }
}
