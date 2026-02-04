package com.utils;

import com.config.ConfigReader;

public class PropertyUtils {

    // Returns configuration value
    public static String getProperty(String key) {
        return ConfigReader.get(key);
    }
}
