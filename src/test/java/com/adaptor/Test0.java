package com.adaptor;

import com.adapter.FileIO;
import com.adapter.FileProperties;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test0 {

    @Test
    void f1() {
//        Properties properties =new Properties();
//        properties.load(new FileInputStream("src/main/resources/file.txt"));
//        System.out.println(properties.keys());
        FileIO fileIO= new FileProperties();
        try {

            fileIO.readFromFile("file.txt");
            String year = fileIO.getValue("year");
            System.out.println(year);
            fileIO.setValue("year","2023");
            fileIO.setValue("month","10");
            fileIO.setValue("day","10");
            fileIO.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
