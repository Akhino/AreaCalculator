package polimorfismo;

public class RaioX implements Aprovavel {
    private String nomePaciente;

    // ESTE É O CONSTRUTOR QUE ESTÁ FALTANDO OU QUE O INTELLIJ NÃO ACHOU:
    public RaioX(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    @Override
    public void aprovar() {
        System.out.println("[Análise Radiológica] Exame de RAIO-X de " + nomePaciente + " laudado e APROVADO.");
    }
}
