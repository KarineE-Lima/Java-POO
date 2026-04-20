package ex018;

public class Desenvolvedor {
    private String nome;
    private String tecnologia;
    private double salario;

    public Desenvolvedor(String nome, String tecnologia, double salario){
        this.nome = nome;
        this.tecnologia = tecnologia;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public String getTecnologia(){
        return tecnologia;
    }
    public double getSalario(){
        return salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTecnologia(String tecnologia){
        this.tecnologia = tecnologia;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}