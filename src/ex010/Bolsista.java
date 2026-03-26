package ex010;

public class Bolsista extends Aluno{
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("O aluno " + getNome() + " é bolsista! Pagamento facilitado!");
    }

}
