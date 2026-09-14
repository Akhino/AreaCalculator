package segregacao;

public class MainSegregacao {
    public static void main(String[] args) {
        System.out.println("--- Testando Sistema de RH (Segregação de Interfaces - ISP) ---\n");

        // Criando uma Recepcionista (depende apenas do contrato de Atendente)
        Atendente recepcionista = new Recepcionista("Letícia");
        recepcionista.realizarAtendimento();

        System.out.println();

        // Criando um Vendedor (combina os múltiplos contratos de forma limpa)
        Vendedor vendedor = new Vendedor("Marcos");
        vendedor.realizarAtendimento();
        vendedor.processarVenda();
        vendedor.calcularComissao();
    }
}
