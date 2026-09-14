package area.calculator;

/**
 * Representa um quadrado. Encapsula o atributo lado e protege suas regras de negócio.
 */
public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        setLado(lado); // Garante a validação na inicialização
    }

    public double getLado() {
        return this.lado;
    }

    /**
     * Define o lado do quadrado impedindo medidas negativas.
     */
    public void setLado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("O lado não pode ser negativo. Valor fornecido: " + lado);
        }
        this.lado = lado;
    }

    /**
     * Regra de negócio isolada do acesso externo direto.
     */
    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }
}
