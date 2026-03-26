package ex008;

public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public boolean getAberto() {
        return aberto;
    }

    public Livro(String autor, Pessoa leitor, String titulo, int totPaginas) {
        setAberto(false);
        setAutor(autor);
        setLeitor(leitor);
        setPagAtual(0);
        setTitulo(titulo);
        setTotPaginas(totPaginas);
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public void detalhes(){
        System.out.printf("-------------- %s ----------------\n", this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Pagina atual: " + this.getPagAtual());
        System.out.println("Aberto: " + this.getAberto());
        System.out.printf("Leitor: %s com %d anos de idade do sexo %s\n", this.getLeitor().getNome(), this.getLeitor().getIdade(), this.getLeitor().getSexo());
    }

    @Override
    public void abrir() {
        if(!this.getAberto())
            this.setAberto(true);
    }

    @Override
    public void fechar() {
        if(this.getAberto())
            this.setAberto(false);
    }

    @Override
    public void folhear(int pg) {
        if(pg <= this.getTotPaginas())
            this.setPagAtual(pg);
    }

    @Override
    public void avancarPag() {
        if(this.getAberto() && this.getPagAtual() < this.getTotPaginas())
            this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        if(this.getAberto() && this.getPagAtual() > 0)
            this.setPagAtual(this.getPagAtual() - 1);
    }
}
