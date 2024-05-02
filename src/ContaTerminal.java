import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Olá, seja bem vindo ao sistema de conta bancária!!");

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número de sua agência: ");
        Integer agenciaConta = Integer.parseInt(scan.nextLine());   // evitando bug com nextInt() e semelhantes

        System.out.println("Por favor, digite o número da sua conta: ");
        Integer numeroConta = Integer.parseInt(scan.nextLine());
        
        System.out.println("Por favor, informe o saldo disponível: ");
        Double saldoDisponivel = Double.parseDouble(scan.nextLine());
        
        System.out.println("\nOlá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaConta+", conta "+numeroConta+" e seu saldo R$"+saldoDisponivel+" já está disponível para saque");

        scan.close();
    }
}
