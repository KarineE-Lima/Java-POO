package ex020;

public class ContaConsumoEnergia {
    private long numeroInstalacao;
    private String nomeTitular;
    private float consumoKWH;
    private float tarifaBase;
    private String bandeiraTarifaria;

    public ContaConsumoEnergia(long numeroInstalacao, String nomeTitular, float tarifaBase, String bandeiraTarifaria){
        this.numeroInstalacao = numeroInstalacao;
        this.nomeTitular = nomeTitular;
        this.tarifaBase = tarifaBase;
        this.bandeiraTarifaria = bandeiraTarifaria;
    }

    public void registrarConsumo(float consumo){
        if(validaConsumo(consumo)){
            this.consumoKWH += consumo;
        }
    }
    public float calcularValorConta(){
        return consumoKWH * tarifaBase;
    }
    public void aplicarDesconto(float desconto){
        if(validaDesconto(desconto)){
            this.tarifaBase -= desconto;
        }
    }
    private boolean validaConsumo(float consumo){
        return consumo >= 0;
    }
    private boolean validaDesconto(float desconto){
        return desconto > 0 && desconto < tarifaBase;
    }
    public void exibirResumo(){
        System.out.println("-------------------------------");
        System.out.printf("Nº Instalação: %d\nNome do Titular: %s\nConsumo(kW/h): %.3f\nTarifa Base: %.2f\nBandeira Tarifária Atual: %s", numeroInstalacao, nomeTitular, consumoKWH, tarifaBase, bandeiraTarifaria);
        
    }
    public String getBandeiraTarifaria() {
        return bandeiraTarifaria;
    }
    public float getConsumoKWH() {
        return consumoKWH;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public long getNumeroInstalacao() {
        return numeroInstalacao;
    }
    public float getTarifaBase() {
        return tarifaBase;
    }
    public void setBandeiraTarifaria(String bandeiraTarifaria) {
        this.bandeiraTarifaria = bandeiraTarifaria;
    }
    
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroInstalacao(long numeroInstalacao) {
        this.numeroInstalacao = numeroInstalacao;
    }
    public void setTarifaBase(float tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
}
