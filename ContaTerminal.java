import java.util.Scanner;

 public class ContaTerminal {
  public static void main(String[] args) {
    String nome, sobreNome, agencia;
    float saldo;
    Scanner scan = new Scanner(System.in);
    int conta; 

    System.out.println("Digite o nome do Correntista: ");
    nome = scan.nextLine();
    System.out.println("Digite o sobrenome do Correntista: ");
    sobreNome = scan.nextLine();
    System.out.println("Digite a agência do Correntista: ");
    agencia = scan.nextLine();
    System.out.println("Digite o número da conta: ");
    conta = scan.nextInt();
    System.out.println("Digite o saldo da conta: ");
    saldo = scan.nextFloat();

    System.out.println("O nome do correntista é "+nome+" "+sobreNome+" cuja conta é "+conta+" na agência "+agencia+" com saldo de R$"+saldo);
  }  
}
