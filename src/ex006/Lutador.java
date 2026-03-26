package ex006;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade,
                   int idade, float altura, float peso,
                   int vitorias, int derrotas, int empates){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);

    }

    public void apresentar(){
        System.out.println("---------------------------------------------");
        System.out.printf("CHEGOU A HORA! Apresentamos o lutador %s!\n", this.getNome());
        System.out.print("Diretamente de " + this.getNacionalidade());
        System.out.printf(" com %d anos e %.2f metros de altura ", this.getIdade(), this.getAltura());
        System.out.printf("pesando %.1f KG\n", this.getPeso());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    public void status(){
        System.out.print(this.getNome());;
        System.out.println(" é um peso " + this.getCategoria());
        System.out.print(this.getVitorias() + " vitórias ");
        System.out.print(this.getDerrotas() + " derrotas ");
        System.out.println(this.getEmpates() + " empates ");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2)
            this.categoria = "Inválido";
        else if (this.peso <= 70.3)
            this.categoria = "Leve";
        else if (this.peso <= 83.9)
            this.categoria = "Médio";
        else if(this.peso <= 120.2)
            this.categoria = "Pesado";
        else this.categoria = "Inválido";
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
}
