package segregacao;

public class Vendedor implements Atendente, Comissionavel {
    private String nome;
    private double totalVendasMes;

    public Vendedor(String nome) {
        this.nome = nome;
        this.totalVendasMes = 0;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Vendedor " + nome + " está atendendo um cliente no showroom.");
    }

    @Override
    public void processarVenda() {
        this.totalVendasMes += 1500.0; // Simula o acréscimo de uma venda
        System.out.println("Vendedor " + nome + " processou uma venda com sucesso. Total do mês: R$" + totalVendasMes);
    }

    @Override
    public void calcularComissao() {
        double comissao = totalVendasMes * 0.10; // 10% de comissão
        System.out.println("Comissão calculada para " + nome + ": R$" + comissao);
    }
}
