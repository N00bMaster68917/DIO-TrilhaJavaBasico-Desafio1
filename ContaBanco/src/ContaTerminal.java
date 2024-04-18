import java.util.Scanner;

public class ContaTerminal {
    
    public static void main (String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String nome;
        String agencia;
        int conta;
        double saldo;

        System.out.println("Por favor, digite o seu nome:");
        nome = scn.nextLine(); 

        System.out.println("Digite o número da conta:");
        conta = scn.nextInt();

        System.out.println("Digite a agência:");
        agencia = scn.nextLine();

        System.out.println("Digite seu saldo:");
        saldo = scn.nextDouble();
        scn.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}