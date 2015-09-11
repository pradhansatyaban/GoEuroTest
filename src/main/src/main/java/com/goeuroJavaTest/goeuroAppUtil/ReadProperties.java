package com.goeuroJavaTest.goeuroAppUtil;

import java.io.IOException;
import java.util.Properties;


/*
 * Created by Satyaban Pradhan
 *              on 28/08/2015
 */

public class ReadProperties {
   // private static final Logger logger = LoggerFactory.getLogger(GoEuroReadProperties.class);
    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemResourceAsStream("goeuro.properties"));
        } catch (IOException e) {
            //logger.error("An error occurred while loading application properties!");
            e.printStackTrace();
        }
    }

    public static String getURL() {
        StringBuilder stringBuilder = new StringBuilder();
        String url = properties.getProperty("url");
        stringBuilder.append(url);
        if (url.endsWith("/")) {
            return stringBuilder.toString();
        } else {
            return stringBuilder.append("/").toString();
        }
    }
}
