package org.example.endterm_course_api.patterns.singleton;

public class AppConfig {

    private static AppConfig instance;

    private final String appName = "Endterm Course API";
    private final String version = "1.0.0";

    private AppConfig() {}

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }
}
