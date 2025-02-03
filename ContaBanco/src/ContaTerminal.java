import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = entrada.next();
        entrada.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente!");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o Saldo da Conta!");
        Double saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        entrada.close();
    }
}
