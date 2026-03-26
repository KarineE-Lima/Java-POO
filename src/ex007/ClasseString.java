package ex007;
// Usando métodos da Classe String
public class ClasseString {
    public static void main(String [] args){
        String nome = "Karine";
        String sobrenome = " Lima";
        System.out.println("O nome é igual a Karine? " + nome.equals("Karine")); // true
        System.out.println("O seu nome com sobrenome é " + nome.concat(sobrenome)); // Karine Lima
        System.out.println("O tamanho da String é " + sobrenome.length()); // 5
    }
}
