package ex028;

public class DatabaseDataSource implements IDataSource{
    private String origin;
    public DatabaseDataSource(String origin){
        this.origin = origin;
    }
    @Override
    public String getData(){
        return "Database Data Source of " + origin;
    }
}
