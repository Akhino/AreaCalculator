package segregacao;

/**
 * Interface coesa voltada para funcionários que operam sob regime de comissão.
 */
public interface Comissionavel {
    void processarVenda();
    void calcularComissao();
}
