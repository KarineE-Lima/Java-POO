package ex023;

public class CalculadoraFrete {
    public double calcularFrete(float peso){
        return peso * 5.0;
    }
    public double calcularFrete(float peso, float distancia){
        return (peso * 2.5) + (distancia * 0.5);
    }
    public double calcularFrete(float peso, float distancia, String tipoDeEntrega){
        var valorBase = (peso * 2.5) + (distancia * 0.5);
        if(tipoDeEntrega.equals("Expresso"))
            valorBase += (valorBase * 1.5);
        return valorBase;
    }
}
