package com.adapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO{

    public static final String DEFAULT_PATH = "src/main/resources/adaptor/";
    private Properties properties;

    public FileProperties() {
        properties = new Properties();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        properties.load(new FileInputStream(DEFAULT_PATH+fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        properties.store(new FileOutputStream(DEFAULT_PATH+fileName),"written by Properties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
