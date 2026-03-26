package ex011;

public class Peixe extends Animal{
    private String corEscama;
    public void soltaBolha(){
        System.out.println("Soltando bolha...");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo alga...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som...");
    }
}
