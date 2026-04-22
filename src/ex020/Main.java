package ex020;

public class Main {
    public static void main(String[] args) {
        ContaConsumoEnergia c1 = new ContaConsumoEnergia(11111, "Valdeci dos Santos", 15.25f, "Vermelha I");
        ContaConsumoEnergia c2 = new ContaConsumoEnergia(22222, "Marina Silva", 10.50f, "Amarela");
        ContaConsumoEnergia c3 = new ContaConsumoEnergia(33333, "João Magalhães", 23.00f, "Vermelha II");
        c1.registrarConsumo(12.5f);
        c2.registrarConsumo(13.7f);
        c3.registrarConsumo(20.5f);
        c1.aplicarDesconto(2.5f);
        c1.exibirResumo();
        System.out.println("Valor da conta: " + c1.calcularValorConta());
        c2.exibirResumo();
        System.out.println("Valor da conta: " + c2.calcularValorConta());
        c3.exibirResumo();
        System.out.println("Valor da conta: " + c3.calcularValorConta());
    }
}
