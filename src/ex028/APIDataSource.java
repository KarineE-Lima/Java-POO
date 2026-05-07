package ex028;

public class APIDataSource implements IDataSource{
    private String origin;
    public APIDataSource(String origin){
        this.origin = origin;
    }
    @Override
    public String getData(){
        return "API Data Source of " + origin;
    }
}
