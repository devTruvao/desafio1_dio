import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o numero da Agencia: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite o nome da Agencia: ");
        agencia = sc.nextLine();
        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o saldo do cliente: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
