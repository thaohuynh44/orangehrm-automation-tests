package dev.orangehrm.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static ConfigLoader configLoader;
    private final Properties properties;

    private ConfigLoader() {
        properties = new Properties();
        try {
            FileInputStream input = new FileInputStream("D:\\HKV\\orangehrm-automation-tests\\src\\test\\resources\\dev_config.properties");
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConfigLoader getInstance() {
        if (configLoader == null) {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getProperty (String propertyName){
        return properties.getProperty(propertyName);
    }
}