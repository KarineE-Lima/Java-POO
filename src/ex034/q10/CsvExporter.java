package ex034.q10;

public class CsvExporter extends Exporter{
    public CsvExporter(){
        super("CSV");
    }
    @Override
    public void export(String data) throws ExportException{
        if(data == null) throw new ExportException(formatName());
        System.out.println("Exporting data in format " + formatName());
    }
}
