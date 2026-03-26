package ex002;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga; // o metodo main está usando a classe, portanto ele pode ter acesso ao protected
    private boolean tampada;
    public void status(){
        System.out.print("Uma caneta " + this.cor + " do modelo " + this.modelo +
                " com ponta " + this.ponta + " e com " + this.carga + "% de carga que ");
        if (!this.tampada)
            System.out.print("não ");
        System.out.println("está tampada");
    }
    public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    protected void tampar(){
        this.tampada = true; // this é uma referencia ao proprio objeto que o chamou
    }
    protected void destampar(){
        this.tampada = false;
    }
}
