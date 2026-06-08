package ex034.q10;

public abstract class Exporter {
    private String formatName;
    public Exporter(String formatName){
        this.formatName = formatName;
    }
    public abstract void export(String data) throws ExportException;
    public String formatName(){
        return formatName;
    }
}
