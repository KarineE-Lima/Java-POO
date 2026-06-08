package ex034.q10;

public class XmlExporter extends Exporter{

    public XmlExporter() {
        super("XML");
    }

    @Override
    public void export(String data) throws ExportException {
         if(data == null) throw new ExportException(formatName());
        System.out.println("Exporting data in format " + formatName());;
    }
    
}
