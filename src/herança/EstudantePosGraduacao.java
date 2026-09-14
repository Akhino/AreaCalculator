package heranca;

public class EstudantePosGraduacao extends Estudante implements Inscritivel {
    private String linhaPesquisa;

    public EstudantePosGraduacao(String nome, String matricula, String linhaPesquisa) {
        super(nome, matricula);
        this.linhaPesquisa = linhaPesquisa;
    }

    public String getLinhaPesquisa() { return linhaPesquisa; }
    public void setLinhaPesquisa(String linhaPesquisa) { this.linhaPesquisa = linhaPesquisa; }

    @Override
    public void inscreverEmDisciplina(String nomeDisciplina) {
        System.out.println("Estudante de Pós-Graduação " + getNome() + " inscrito na disciplina: " + nomeDisciplina);
    }
}
