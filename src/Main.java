public class Main {
    public static void main(String[] args) {
        CatracaEmpresa catraca = new CatracaEmpresa();

        System.out.println("Bem-vindo à empresa!");

        FuncionarioEmpresa funcionario1 = new FuncionarioEmpresa("João Silva", "1234567890");
        FuncionarioEmpresa funcionario2 = new FuncionarioEmpresa("Maria Souza", "9876543210");

        System.out.println("Registro do funcionário: " + funcionario1);
        catraca.passarCartao(funcionario1);
        if (catraca.isAcessoLiberado()) {
            System.out.println("Entrada liberada!");
        } else {
            System.out.println("Entrada negada!");
        }

        System.out.println("Registro do funcionário: " + funcionario2);
        catraca.passarCartao(funcionario2);
        if (catraca.isAcessoLiberado()) {
            System.out.println("Entrada liberada!");
        } else {
            System.out.println("Entrada negada!");
        }

        System.out.println("Registro do funcionário: " + funcionario1);
        catraca.sair(funcionario1);
        System.out.println("Saída registrada!");

        System.out.println("Registro do funcionário: " + funcionario2);
        catraca.sair(funcionario2);
        System.out.println("Saída registrada!");
    }
}
