package heranca;

public class MainHeranca {
    public static void main(String[] args) {
        System.out.println("--- Testando Sistema Acadêmico (LSP & Interfaces) ---\n");

        Estudante grad = new EstudanteGraduacao("Carlos", "GR123", "Análise de Algoritmos Paralelos");
        Estudante pos = new EstudantePosGraduacao("Ana", "PG456", "Computação Distribuída");
        Estudante ouvinte = new EstudanteOuvinte("Mariana", "OV789");

        System.out.println("Processando inscrições automáticas:");

        tentarInscrever(grad, "Programação Concorrente");
        tentarInscrever(pos, "Sistemas Distribuídos Avançados");
        tentarInscrever(ouvinte, "Arquitetura de Software");
    }

    public static void tentarInscrever(Estudante estudante, String disciplina) {
        if (estudante instanceof Inscritivel) {
            ((Inscritivel) estudante).inscreverEmDisciplina(disciplina);
        } else {
            System.out.println("Aviso: O estudante " + estudante.getNome() + " (Matrícula: " + estudante.getMatricula() + ") é OUVINTE e não tem permissão para inscrição.");
        }
    }
}
