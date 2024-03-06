package questaoTres;

public class RegraNegocioEmpresa {
    private Empresa[] lista = new Empresa[2];
    private int contador = 0;

    public void cadastrarEmpresa(Empresa empresa){
        this.lista[contador] = empresa;
        this.contador++;
    }

    public Empresa[] listar(){
        return this.lista;
    }
}
