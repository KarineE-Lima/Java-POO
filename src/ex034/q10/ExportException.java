package ex034.q10;

public class ExportException extends Exception{
    private String format;
    public ExportException(String format){
        super("Error when exporting, data is null.");
        this.format = format;
    }
    public String format(){
        return format;
    }
}
