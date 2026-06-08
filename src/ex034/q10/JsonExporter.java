package ex034.q10;

public class JsonExporter extends Exporter implements Compressible{

    public JsonExporter() {
        super("JSON");
    }

    @Override
    public void export(String data) throws ExportException {
        if(data == null) throw new ExportException(formatName());
        System.out.println("Exporting data in format " + formatName());
    }
    @Override
    public void compress(){
        System.out.println("Compress Json archive...");
    }
    
}
