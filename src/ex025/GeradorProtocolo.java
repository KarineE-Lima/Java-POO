package ex025;

import java.time.*;

public class GeradorProtocolo {
    private static int numeroProtocolo = 0;
    private LocalDateTime dataHoraGeracao;
    private String codigoFormatado;
    private static String sistema = "Sac";

    public GeradorProtocolo(){
        this.codigoFormatado = gerarCodigo();
    }
    private String gerarCodigo(){
        numeroProtocolo++;
        dataHoraGeracao = LocalDateTime.now();
        return sistema + "-" + dataHoraGeracao + "-" + numeroProtocolo;
    }
    public void imprimirCodigo(){
        System.out.println(codigoFormatado);
    }
}