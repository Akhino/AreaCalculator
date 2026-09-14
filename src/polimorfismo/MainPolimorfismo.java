package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class MainPolimorfismo {
    public static void main(String[] args) {
        // Criando o processador genérico
        ProcessadorDeExames processador = new ProcessadorDeExames();

        // Criando uma lista polimórfica que aceita QUALQUER objeto que seja "Aprovavel"
        List<Aprovavel> filaDeExames = new ArrayList<>();

        // Adicionando diferentes exames na mesma lista
        filaDeExames.add(new ExameDeSangue("João Silva"));
        filaDeExames.add(new RaioX("Maria Souza"));
        filaDeExames.add(new ExameDeSangue("Pedro Alencar"));

        // Enviando para o processamento genérico
        processador.processarTodos(filaDeExames);
    }
}
