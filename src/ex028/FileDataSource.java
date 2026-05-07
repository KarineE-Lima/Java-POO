package ex028;

public class FileDataSource implements IDataSource {
    private String origin;
    public FileDataSource(String origin){
        this.origin = origin;
    }
    @Override
    public String getData(){
        return "File Data Source of " + origin;
    }
}
