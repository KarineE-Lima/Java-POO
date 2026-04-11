package ex017;

public class AppConfig {
    private String appName;
    private String version;
    private int maxConnections;
    private int timeOutSeconds;
    private boolean isDebugMode;

    public AppConfig(String appName){
        this.appName = appName;
        this.version = "1.0";
        this.maxConnections = 1;
        this.timeOutSeconds = 0;
        this.isDebugMode = false;
    }
    public AppConfig(String appName, String version, int maxConnections){
        this(appName);
        this.version = version;
        this.maxConnections = maxConnections;
    }
    public AppConfig(String appName, String version, int maxConnections, int timeOutSeconds, boolean isDebugMode){
        this(appName, version, maxConnections);
        this.timeOutSeconds = timeOutSeconds;
        this.isDebugMode = isDebugMode;
    }
    public void updateSettings(int maxConnections, int timeOutSeconds){
        if(validateConfig()){
            this.maxConnections = maxConnections;
            this.timeOutSeconds = timeOutSeconds;
        }
    }
    public void updateSettings(boolean isDebugMode){
        this.isDebugMode = isDebugMode;
    }
    private boolean validateConfig(){
        return (appName != null || !appName.equals("")) && (version != null || !version.equals("")) && maxConnections > 0 && timeOutSeconds >=0;
    }
    
}
