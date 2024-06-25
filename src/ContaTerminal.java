import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura da entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados da conta
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Consumir a quebra de linha pendente após a leitura de um int
        scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Fechando o objeto Scanner
        scanner.close();

        // Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}
