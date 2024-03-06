package questaoDois;

public class QuestaoDois {
    public static void main(String[] args) {
        MetodoQuestaoDois metodo = new MetodoQuestaoDois();

        metodo.preencherNumeros();
        int somar = metodo.metodoSoma();

        System.out.println("\nA soma dos valores é: "+somar);
    }
}
