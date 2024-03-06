package questaoTres;

import java.util.Arrays;

public class MainQuestaoTres {
    public static void main(String[] args) {

        Empresa emp1 = new Empresa("622827373", "823827478", "iFoome");
        Empresa emp2 = new Empresa("823898379", "623653228", "Pandoko");

        Funcionario func1 = new Funcionario("111.111-11", "Ramon1", "11.111.11", "(11) 1111-1111", emp1);
        Funcionario func2 = new Funcionario("222.222-22", "Ramon2", "22.222.22", "(22) 2222-2222", emp2);
        Funcionario func3 = new Funcionario("333.333-33", "Ramon3", "33.333.33", "(33) 3333-3333", emp1);
        Funcionario func4 = new Funcionario("444.444-44", "Ramon4", "44.444.44", "(44) 4444-4444", emp2);

        RegraNegocioEmpresa rne = new RegraNegocioEmpresa();
        rne.cadastrarEmpresa(emp1);
        rne.cadastrarEmpresa(emp2);

        RegraNegocioFuncionario rnf = new RegraNegocioFuncionario();
        rnf.cadastrarFuncionario(func1);
        rnf.cadastrarFuncionario(func2);
        rnf.cadastrarFuncionario(func3);
        rnf.cadastrarFuncionario(func4);

        System.out.println(Arrays.toString(rne.listar()));
        System.out.println(Arrays.toString(rnf.listar()));
    }
}
