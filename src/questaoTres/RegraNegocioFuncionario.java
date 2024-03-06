package questaoTres;

public class RegraNegocioFuncionario {
    private Funcionario[] lista = new Funcionario[4];
    private int contador = 0;

    public void cadastrarFuncionario(Funcionario funcionario) {
        this.lista[contador] = funcionario;
        this.contador++;
    }

    public Funcionario[] listar() {
        return this.lista;
    }
}
