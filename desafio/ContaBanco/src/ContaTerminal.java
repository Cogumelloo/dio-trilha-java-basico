
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuario

        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o numero da sua conta!");
        int conta = scanner.nextInt();

        System.out.println("Qual seria o valor para deposito?");
        double saldo = scanner.nextDouble();

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada.

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + " conta " + conta + " e seu saldo é R$" + saldo + " já está disponivel para saque.");
    }
}
