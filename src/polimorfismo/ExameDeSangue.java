package polimorfismo;

public class ExameDeSangue implements Aprovavel {
    private String nomePaciente;

    public ExameDeSangue(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    @Override
    public void aprovar() {
        System.out.println("[Análise Laboratorial] Exame de SANGUE de " + nomePaciente + " analisado e APROVADO.");
    }
}
