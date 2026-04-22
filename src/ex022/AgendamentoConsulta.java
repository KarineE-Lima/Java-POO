package ex022;

import java.time.LocalDate;

public class AgendamentoConsulta {
    private String paciente;
    private String especialidade;
    private LocalDate data;
    private double valor;

    public AgendamentoConsulta(){
        
    }
    public AgendamentoConsulta(String paciente, String especialidade, LocalDate data, double valor){
        this.paciente = paciente;
        this.especialidade = especialidade;
        this.data = data;
        this.valor = valor;
    }
    public AgendamentoConsulta setData(LocalDate data) {
        this.data = data;
        return this;
    }
    public AgendamentoConsulta setPaciente(String paciente) {
        this.paciente = paciente;
        return this;
    }
    public AgendamentoConsulta setEspecialidade(String especialidade){
        this.especialidade = especialidade;
        return this;
    }
    public AgendamentoConsulta setValor(double valor){
        this.valor = valor;
        return this;
    }
    public void atualizarConsulta(String especialidade, LocalDate data, double valor){
        this.setEspecialidade(especialidade)
        .setData(data)
        .setValor(valor);
    }
   
    public String toString() {
        return "Paciente: " + paciente + ", Especialidade: " + especialidade + ", Data: " + data + ", Valor: " + valor;
    }
}
