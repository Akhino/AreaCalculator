package area.calculator;

/**
 * Representa a abstração de uma forma geométrica.
 * Define o contrato essencial que todas as subclasses devem seguir.
 */
public abstract class Forma {

    /**
     * Calcula a área da forma geométrica.
     * A implementação específica da fórmula é delegada às subclasses.
     *
     * @return a área calculada.
     */
    public abstract double calcularArea();
}
