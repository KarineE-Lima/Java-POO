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
        validateConfig();
    }
    public AppConfig(String appName, String version, int maxConnections){
        this(appName);
        this.version = version;
        this.maxConnections = maxConnections;
        validateConfig();
    }
    public AppConfig(String appName, String version, int maxConnections, int timeOutSeconds, boolean isDebugMode){
        this(appName, version, maxConnections);
        this.timeOutSeconds = timeOutSeconds;
        this.isDebugMode = isDebugMode;
        validateConfig();
    }
    public void updateSettings(int maxConnections, int timeOutSeconds){
            this.maxConnections = maxConnections;
            this.timeOutSeconds = timeOutSeconds;
            validateConfig();
    }
    public void updateSettings(boolean isDebugMode){
        this.isDebugMode = isDebugMode;
    }
    private void validateConfig(){
        if(appName == null || appName.trim().isEmpty())
            throw new IllegalArgumentException("App Name não pode ser vazio...");
        if(version == null || version.trim().isEmpty())
            throw new IllegalArgumentException("Version não pode ser vazia.");
        if(maxConnections <= 0)
            throw new IllegalArgumentException("Max conections não pode ser menor que um.");
        if(timeOutSeconds < 0)
            throw new IllegalArgumentException("Time out seconds não pode ser negativo.");
    }
    public String toString(){
        return "appName: " + appName + " version: " + version + " maxConnections: " + maxConnections + " timeOutSeconds: " + timeOutSeconds + " isDebugMode: " + isDebugMode;
    }
    
}
