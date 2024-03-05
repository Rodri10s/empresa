package questaoUm;

import java.util.Scanner;

public class MetodoQuestaoUm {
    private String[] nomes = new String[10];

    public void preencherNomes(){
        Scanner input = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Digite o "+(i+1)+"° nome:" );
            String nome = input.nextLine();

            this.nomes[i] = nome;
        }
    }

    public void imprimir(){
        System.out.println("Nomes em ordem alfabética: ");
        for (String nome : nomes) {
            System.out.println(nome); 
        }
       
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }
    
    
}
