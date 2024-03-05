package questaoDois;

public class Soma {
        
    private int resultado;

    public int metodoSoma(){
        MetodoQuestaoDois metodo = new MetodoQuestaoDois();

        int[] numeros = metodo.getNumeros();

        for (int i=0; i<metodo.getNumeros().length; i++){
            this.resultado = this.resultado + numeros[i];
        }

        return this.resultado;
    }
}
