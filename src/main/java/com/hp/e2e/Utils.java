package com.hp.e2e;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    static Properties prop = new Properties();


    public static String getPropertyData(String getData) throws IOException {
        String path;

        path = new File("src/test/resources/application.properties").getAbsolutePath();

        FileInputStream in = new FileInputStream(path);
        prop.load(in);
        return prop.getProperty(getData);
    }

}
