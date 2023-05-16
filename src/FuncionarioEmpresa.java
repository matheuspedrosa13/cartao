public class FuncionarioEmpresa {
    private String nome;
    private String numeroCartao;

    public FuncionarioEmpresa(String nome, String numeroCartao) {
        this.nome = nome;
        this.numeroCartao = numeroCartao;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }
}
