package questaoDois;

import java.util.Scanner;

public class MetodoQuestaoDois {
    private int[] numeros = new int[10];

    public void preencherNumeros(){
        Scanner input = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Digite o "+(i+1)+"° número:" );
            int numero = input.nextInt();

            this.numeros[i] = numero;
        }
    }

    public int metodoSoma(){
        int resultado = 0;

        for (int i=0; i<numeros.length; i++){
            resultado = resultado + numeros[i];
        }

        return resultado;
    }
    
}
