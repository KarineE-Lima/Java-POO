package ex019;

public class Reserva {
    private Sala salaReservada;
    private String responsavel;

    public String getResponsavel() {
        return responsavel;
    }
    public Sala getSalaReservada() {
        return salaReservada;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    public void setSalaReservada(Sala salaReservada) {
        this.salaReservada = salaReservada;
    }
}
