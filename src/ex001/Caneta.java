package ex001;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.print("Uma caneta " + this.cor + " do modelo " + this.modelo +
                " com ponta " + this.ponta + " e com " + this.carga + "% de carga que ");
        if (!this.tampada)
            System.out.print("não ");
        System.out.println("está tampada");
    }
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true; // this é uma referencia ao proprio objeto que o chamou
    }
    void destampar(){
        this.tampada = false;
    }
}
