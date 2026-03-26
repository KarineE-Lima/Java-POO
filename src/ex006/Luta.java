package ex006;


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria().equals(l2.getCategoria())) && l1 != l2){
            setDesafiado(l1);
            setDesafiante(l2);
            setAprovada(true);
        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar(){
        if(this.aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            int vencedor = 0 + (int) Math.random() * (2-0);
            switch (vencedor){
                case 0:
                    System.out.println("Empatou!");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " ganhou!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + " ganhou!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        } else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dd) {
        this.desafiante = dd;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
