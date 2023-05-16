import java.util.ArrayList;
import java.util.List;

public class CatracaEmpresa {
    private boolean acessoLiberado;
    private List<String> cartoesAcessoPermitido;

    public CatracaEmpresa() {
        this.acessoLiberado = false;
        this.cartoesAcessoPermitido = new ArrayList<>();
    }

    public void passarCartao(FuncionarioEmpresa funcionario) {
        if (validarCartao(funcionario)) {
            liberarAcesso(funcionario);
            System.out.println("Acesso permitido. Bem-vindo, " + funcionario.getNome() + "!");
        } else {
            bloquearAcesso();
            System.out.println("Acesso negado. Por favor, verifique seu cartão.");
        }
    }

    private boolean validarCartao(FuncionarioEmpresa funcionario) {
        String numeroCartaoFuncionario = funcionario.getNumeroCartao();
        return cartoesAcessoPermitido.contains(numeroCartaoFuncionario);
    }

    private void liberarAcesso(FuncionarioEmpresa funcionario) {
        String numeroCartaoFuncionario = funcionario.getNumeroCartao();
        if (!cartoesAcessoPermitido.contains(numeroCartaoFuncionario)) {
            cartoesAcessoPermitido.add(numeroCartaoFuncionario);
        }
        acessoLiberado = true;
    }

    private void bloquearAcesso() {
        cartoesAcessoPermitido.clear();
        acessoLiberado = false;
    }

    public boolean isAcessoLiberado() {
        return acessoLiberado;
    }

    public void sair(FuncionarioEmpresa funcionario) {
        String numeroCartaoFuncionario = funcionario.getNumeroCartao();
        cartoesAcessoPermitido.remove(numeroCartaoFuncionario);
    }
}

