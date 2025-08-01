import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Iniciando o sistema bancário...");

        System.out.print("Digite o número da sua conta: ");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite a agência: ");
        String agencia = scan.nextLine();

        System.out.print("Digite seu nome: ");
        String name = scan.nextLine();

        System.out.print("Digite o saldo inicial: ");
        Double saldo = scan.nextDouble();

        Conta conta = new Conta(numero, agencia, name, saldo);

        System.out.println("\nConta criada com sucesso!");

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Ver dados da conta");
            System.out.println("2 - Ver saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Número: " + numero);
                    System.out.println("Agência: " + agencia);
                    System.out.println("Titular: " + name);
                    break;
                case 2:
                    conta.exibirSaldo();
                    break;
                case 3:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = scan.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado!");
                    break;
                case 4:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = scan.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scan.close();
    }
}