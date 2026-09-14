package area.calculator;

/**
 * Representa um círculo. Encapsula o atributo raio e valida sua integridade.
 */
public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio); // Utiliza o setter para garantir a validação desde o construtor
    }

    public double getRaio() {
        return this.raio;
    }

    /**
     * Define o raio do círculo com validação estrita de integridade.
     * Evita corrupção de estado do objeto.
     */
    public void setRaio(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("O raio não pode ser negativo. Valor fornecido: " + raio);
        }
        this.raio = raio;
    }

    /**
     * Regra de negócio protegida internamente na classe.
     */
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}
