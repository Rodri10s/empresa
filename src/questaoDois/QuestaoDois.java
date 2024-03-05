package questaoDois;

public class QuestaoDois {
    public static void main(String[] args) {
        MetodoQuestaoDois metodo = new MetodoQuestaoDois();
        Soma soma = new Soma();

        metodo.preencherNumeros();
        int somar = soma.metodoSoma();

        System.out.println(somar);
    }
}
