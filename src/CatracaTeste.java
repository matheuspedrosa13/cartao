import java.util.Scanner;

public class CatracaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CatracaEmpresa catraca = new CatracaEmpresa();

        System.out.println("Bem-vindo à empresa!");

        while (true) {
            System.out.print("Digite o número do cartão do funcionário: ");
            String numeroCartao = scanner.nextLine();

            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();

            FuncionarioEmpresa funcionario = new FuncionarioEmpresa(nome, numeroCartao);

            System.out.print("Deseja permitir a entrada (E) ou saída (S) do funcionário? ");
            String opcao = scanner.nextLine().toUpperCase();

            if (opcao.equals("E")) {
                catraca.passarCartao(funcionario);
                if (catraca.isAcessoLiberado()) {
                    System.out.println("Entrada liberada!");
                } else {
                    System.out.println("Entrada negada!");
                }
            } else if (opcao.equals("S")) {
                catraca.sair(funcionario);
                System.out.println("Saída registrada!");
            } else {
                System.out.println("Opção inválida!");
            }

            System.out.print("Deseja continuar? (S/N) ");
            String resposta = scanner.nextLine().toUpperCase();
            if (resposta.equals("N")) {
                break;
            }
        }
    }
}
