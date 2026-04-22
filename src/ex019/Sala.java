package ex019;

public class Sala{
    private String codigo;
    private int capacidade;
    private boolean statusOcupacao;

    public Sala(String codigo, int capacidade){
        this.codigo = codigo;
        this.capacidade = capacidade;
        this.statusOcupacao = false;
    }

    public String getCodigo(){
        return codigo;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public boolean getStatusOcupacao(){
        return statusOcupacao;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public void setStatusOcupacao(boolean statusOcupacao){
        this.statusOcupacao = statusOcupacao;
    }
    public void exibirInfo(){
        System.out.println("Codigo: " + getCodigo() + " Capacidade: " + getCapacidade() + " Ocupada: " + getStatusOcupacao());
    }
}