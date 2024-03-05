package questaoUm;

import java.util.Arrays;

public class QuestaoUm {
    public static void main(String[] args) {
        
        MetodoQuestaoUm metodo = new MetodoQuestaoUm();

        metodo.preencherNomes();
        Arrays.sort(metodo.getNomes());
        
        metodo.imprimir();
    }
}
