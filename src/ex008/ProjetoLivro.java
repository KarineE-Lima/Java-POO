package ex008;

public class ProjetoLivro {
    public static void main(String[] args){
        Pessoa []p = new Pessoa[2];
        Livro [] l = new Livro[3];
        p[0] = new Pessoa(18, "Jubiscleia Correia", "Feminino");
        p[1] = new Pessoa(52, "Robson Silva", "Masculino");

        l[0] = new Livro("Machado de Assis", p[0], "Dom Casmurro", 208);
        l[1] = new Livro("Arthur Conan Doyle", p[1], "O Cão dos Baskervilles", 219);
        l[2] = new Livro("John Green", p[1], "Cidades de Papel", 350);
        l[0].abrir();
        l[0].folhear(18);
        l[0].avancarPag();
        l[0].folhear(300);
        l[0].detalhes();
    }
}
