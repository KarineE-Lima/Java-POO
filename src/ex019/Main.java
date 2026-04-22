package ex019;

public class Main {
    public static void main(String [] args){
        Sala s1 = new Sala("A28", 40);
        Sala s2 = s1;
        //s1.exibirInfo();
        s2.setStatusOcupacao(true);
        //s1.exibirInfo();
        Reserva r1 = new Reserva();
        System.out.println(r1.getSalaReservada());
        r1.setSalaReservada(s2);
        r1.getSalaReservada().exibirInfo();
    }
}
