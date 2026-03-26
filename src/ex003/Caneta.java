package ex003;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String m, String c, float p){ // esse é o construtor
        this.tampar();
        setCor(c);
        setModelo(m);
        setPonta(p);
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor(String c) {
        this.cor = c;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void status(){
        System.out.println("\nSobre a caneta: ");
        System.out.printf("Modelo: %s \nPonta: %.1f\nCor: %s\nTampada: %b\n", getModelo(), getPonta(), this.getCor(),this.tampada);
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
