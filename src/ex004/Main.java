package ex004;

public class Main {
    public static void main(String [] args){
        ContaBanco c1 = new ContaBanco(11111, "Maria das Graças");
        c1.abrirConta("CC");
        ContaBanco c2 = new ContaBanco(22222, "Ramiro Machado");
        c2.abrirConta("CP");
        c1.depositar(200);
        c2.depositar(400);
        c1.sacar(800);
        c1.imprimirDados();
        c2.imprimirDados();
    }
}
