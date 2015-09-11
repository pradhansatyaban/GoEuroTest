package com.goeuroJavaTest.goeuroAppUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;
/*
 * Created by Satyaban Pradhan
 *              on 28/08/2015
 */

public class GoEuroReadProperties {
    private static final Logger logger = LoggerFactory.getLogger(GoEuroReadProperties.class);
    private static final Properties prop;

    static {
        prop = new Properties();
        String propFileName = "goeuro.properties";
        try {
            prop.load(ClassLoader.getSystemResourceAsStream(propFileName));

        } catch (IOException e) {
            logger.error("An error occurred while loading" + propFileName);
            e.printStackTrace();
        }
    }

    //Build the URL path
    public static String getPath() {
        StringBuilder stringBuilder = new StringBuilder();
        String url = prop.getProperty("url");
        stringBuilder.append(url);
        if (url.endsWith("/")) {
            return stringBuilder.toString();
        } else {
            return stringBuilder.append("/").toString();
        }
    }
}
