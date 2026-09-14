package heranca;

/**
 * Superclasse abstrata com os atributos base de qualquer estudante.
 */
public abstract class Estudante {
    private String nome;
    private String matricula;

    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
}
