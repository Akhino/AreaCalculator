package area.calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testando o Sistema AreaCalculator ---\n");

        // 1. Criando objetos válidos
        Forma circulo = new Circulo(5.0);
        Forma quadrado = new Quadrado(4.0);

        System.out.println("Área do Círculo (Raio 5): " + circulo.calcularArea());
        System.out.println("Área do Quadrado (Lado 4): " + quadrado.calcularArea());

        System.out.println("\n--- Validação de Integridade ---");

        // 2. Tentando quebrar o encapsulamento com valor inválido
        try {
            System.out.println("Tentando criar um quadrado com lado negativo (-3.0)...");
            Forma quadradoInvalido = new Quadrado(-3.0);
        } catch (IllegalArgumentException e) {
            // A exceção é capturada aqui, provando que o objeto protegeu seu estado
            System.err.println("Sucesso! A segurança do objeto barrou a operação.");
            System.err.println("Motivo do bloqueio: " + e.getMessage());
        }
    }
}
