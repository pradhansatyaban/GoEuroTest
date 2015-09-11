package com.goeuroJavaTest.goeuro;

import com.goeuroJavaTest.goeuroException.CsvWriterException;
import com.goeuroJavaTest.goeuroException.HttpResponseException;
import com.goeuroJavaTest.goeuroHttpClient.GoEuroClient;
import com.goeuroJavaTest.goeuroPosition.Position;
import com.goeuroJavaTest.goeuroCSVWriter.CsvWriter;


/*
 * Created by Satyaban Pradhan
 *              on 28/08/2015
 */

public class GoEuro {

    public static void main(String[] args) throws HttpResponseException, CsvWriterException {
        if (args.length == 0) {
            System.err.println("Please enter Location!");
            printUsage();
        } else {
            StringBuilder inputCity = new StringBuilder();
            System.out.println("Note : \n" +
                    "1. Resultant CSV file will get created in your users directory present in C drive.Like:C:\\Users\\sony\\yourCsvFileName.\n"+
                    "2. Resultant CSV file get generate with name Location you provided and Date and Time. Like If you provide location as New York so\n"+
                    "   file will have name :- New York_201503221206.csv");
            inputCity.append(args[0]);
            for (int i = 1; i < args.length; i++) {
                inputCity.append(" " + args[i]);
            }
            Position[] response = new GoEuroClient().getPosition(inputCity);
            //System.out.println("Response---------------"+response);
            CsvWriter.writeToCsv(response, inputCity);
        }
    }

    private static void printUsage() {
        System.err.println("Usage: Please enter city name");
        System.exit(1);
    }
}
