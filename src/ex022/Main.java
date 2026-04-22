package ex022;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AgendamentoConsulta aC1 = new AgendamentoConsulta("Marina", "Dermatologista", LocalDate.of(2026,05,12), 118.99);
        AgendamentoConsulta aC2 = new AgendamentoConsulta()
        .setPaciente("Joana")
        .setEspecialidade("Ortopedista")
        .setData(LocalDate.of(2025, 11, 12))
        .setValor(180.20);
       System.out.println(aC1.toString());
       System.out.println(aC2.toString());
    }
}
