package polimorfismo;

import java.util.List;

public class ProcessadorDeExames {

    // ESTE É O MÉTODO QUE A MAIN ESTÁ PROCURANDO:
    public void processarTodos(List<Aprovavel> exames) {
        System.out.println("=== Iniciando Processamento em Lote de Exames ===");

        for (Aprovavel exame : exames) {
            exame.aprovar();
        }

        System.out.println("=== Processamento Concluído com Sucesso ===\n");
    }
}
