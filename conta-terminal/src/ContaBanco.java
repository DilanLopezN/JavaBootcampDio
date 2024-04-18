import java.util.Scanner;

public class ContaBanco {

  String agencia, nomeCliente;
  int numeroConta;
  float saldo; 

  Scanner scanner = new Scanner(System.in);

  public void CriarConta() {
    System.out.print("Digite seu nome: ");
    nomeCliente = scanner.next();

    System.out.print("Digite sua agência: ");
    agencia = scanner.next();

    System.out.print("Digite o número de sua conta: ");
    numeroConta = scanner.nextInt();

    System.out.print("Digite seu saldo: ");
    saldo = scanner.nextFloat();

    System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " +  saldo  + " já está disponível para saque");

  }
   
}