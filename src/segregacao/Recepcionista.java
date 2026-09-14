package segregacao;

public class Recepcionista implements Atendente {
    private String nome;

    public Recepcionista(String nome) {
        this.nome = nome;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Recepcionista " + nome + " está realizando o atendimento no balcão e organizando a agenda.");
    }
}
