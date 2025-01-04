import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("digite o numero da agencia:");
        String agencia = scanner.nextLine();
        System.out.println("digite o seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Qual seu saldo?:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero + " e seu saldo " + saldo +" já está disponível para saque");

        





    }
}

