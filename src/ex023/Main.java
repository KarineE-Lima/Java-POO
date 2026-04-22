package ex023;

public class Main {
    public static void main(String[] args) {
        CalculadoraFrete c1 = new CalculadoraFrete();
        System.out.printf("Método 1: R$ %.2f\n", c1.calcularFrete(2.0f));
        System.out.printf("Método 2: R$ %.2f\n", c1.calcularFrete(2.0f, 20.5f));
        System.out.printf("Método 3: R$ %.2f\n", c1.calcularFrete(2.0f, 20.5f, "Expresso"));

    }
}
