package ex004;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int n, String d){
        setNumConta(n);
        setDono(d);
        setSaldo(0.0f);
        fecharConta();
    }

    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void abrirConta(String t){

        setTipo(t);
        setStatus(true);
        if(t.equals("CC"))
            setSaldo(50f);
        if(t.equals("CP"))
            setSaldo(150f);
    }
    public void fecharConta(){
        if(this.saldo == 0)
            setStatus(false);
        else
            System.out.println("Não podemos fechar a conta!");
    }

    public void depositar(float valor){
        if(this.status) {
            setSaldo(getSaldo() + valor);
            System.out.println("Saldo Depositado com sucesso na conta de " + getDono());
        }else
            System.out.println("Não será possível depositar o valor na conta de " + getDono());
    }
    public void sacar(float valor){
        if(this.status && valor <= this.saldo) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saldo sacado com sucesso da conta de " + getDono());
        }else
            System.out.println("Não foi possível sacar o valor desejado na conta de " + getDono());
    }
    public void pagarMensal(){
        if(this.status){
            if(this.tipo.equals("CC"))
                setSaldo(getSaldo() - 12);
            if (this.tipo.equals("CP"))
                setSaldo(getSaldo() - 20);
        }
    }
    public void imprimirDados(){
        System.out.println("Dados da conta nº "+ getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.printf("Saldo: %.2f\n", getSaldo());
        System.out.println("Status: " + this.status);
    }



    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
