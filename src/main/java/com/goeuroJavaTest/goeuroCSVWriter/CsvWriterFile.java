package com.goeuroJavaTest.goeuroCSVWriter;

import com.goeuroJavaTest.goeuroGeoLogLat.GeoLogLat;
import com.goeuroJavaTest.goeuroPosition.Position;
import com.goeuroJavaTest.goeuroException.CSVControlException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.String.format;


/*
 * Created by Satyaban Pradhan
 *             on 28/08/2015
 */

public class CsvWriterFile {

    private final static Logger logger = LoggerFactory.getLogger(CsvWriterFile.class);
    private static final StringBuilder FILE_HEADER = new StringBuilder();

    public static void writeToCsv(final Position[] response, StringBuilder yourCity) throws CSVControlException {
        if (response == null || response.length == 0) {
            logger.info("No Geo positions for given City");
            return;
        }

        try {
            boolean success = new java.io.File(System.getProperty("user.home"), yourCity.toString()).mkdirs();
            System.out.println(" Folder created under user directory : Name is " + yourCity.toString());

            FILE_HEADER.append(System.getProperty("user.home")+"\\" +yourCity.toString()).append("/").append(yourCity).append("_").append(new SimpleDateFormat("yyyy-MM-dd-hhmm").format(new Date())).append(".csv");
            OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream(FILE_HEADER.toString()), "UTF-8");

            fileWriter.append("_id");
            fileWriter.append(",");
            fileWriter.append("name");
            fileWriter.append(",");
            fileWriter.append("type");
            fileWriter.append(",");
            fileWriter.append("latitude");
            fileWriter.append(",");
            fileWriter.append("longitude");
            fileWriter.append("\n");

            for (Position position : response) {
                fileWriter.append(Integer.toString(position.getId()));
                fileWriter.append(",");
                fileWriter.append(position.getName());
                fileWriter.append(",");
                fileWriter.append(position.getType());
                fileWriter.append(",");
                GeoLogLat geoLogLat = position.getGeoLogLat();
                fileWriter.append(Double.toString(geoLogLat.getLatitude()));
                fileWriter.append(",");
                fileWriter.append(Double.toString(geoLogLat.getLongitude()));
                fileWriter.append("\n");
            }

            fileWriter.flush();
            fileWriter.close();
            System.out.println(" CSV file was created successfully !!! ");

        } catch (IOException e) {
            logger.error("An IO Exception occurred:-",e.getMessage());
            throw new CSVControlException(format("An IO Exception occurred:- %s", e.getMessage()));
        }
    }
}
