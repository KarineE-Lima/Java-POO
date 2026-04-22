package ex021;

public class Main {
    public static void main(String[] args) {
        ProdutoEstoque p1 = new ProdutoEstoque("12785").setNome("Lenço Umidecido").setPrecoUnitario(12.45);
        System.out.println(p1.toString());
        ProdutoEstoque p2 = new ProdutoEstoque("Pulseira", "888841", 10.0);
        System.out.println(p2.toString());
        ProdutoEstoque p3 = new ProdutoEstoque("Caneta", "178954", 12,16.70 );
        System.out.println(p3.toString());
    }
}
