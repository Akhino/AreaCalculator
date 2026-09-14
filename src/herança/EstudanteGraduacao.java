package heranca;

public class EstudanteGraduacao extends Estudante implements Inscritivel {
    private String projetoConclusao;

    public EstudanteGraduacao(String nome, String matricula, String projetoConclusao) {
        super(nome, matricula);
        this.projetoConclusao = projetoConclusao;
    }

    public String getProjetoConclusao() { return projetoConclusao; }
    public void setProjetoConclusao(String projetoConclusao) { this.projetoConclusao = projetoConclusao; }

    @Override
    public void inscreverEmDisciplina(String nomeDisciplina) {
        System.out.println("Estudante de Graduação " + getNome() + " inscrito na disciplina: " + nomeDisciplina);
    }
}
