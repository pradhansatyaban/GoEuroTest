package com.goeuroJavaTest.goeuro;

import com.goeuroJavaTest.goeuroPosition.Position;
import com.goeuroJavaTest.goeuroCSVWriter.CsvWriterFile;
import com.goeuroJavaTest.goeuroException.CSVControlException;
import com.goeuroJavaTest.goeuroException.HttpResponseException;
import com.goeuroJavaTest.goeuroHttpClient.GoEuroClient;

/*
 * Created by Satyaban Pradhan
 *              on 28/08/2015
 */

public class GoEuroMain {


    public static void  main(String[] args) throws HttpResponseException, CSVControlException {
        if (args.length == 0) {
            System.err.println("Enter your City ");

        } else {
            StringBuilder yourCity = new StringBuilder();
            System.out.println(" CSV file will be generated under given city which will be got created user directory ");

            yourCity.append(args[0]);
            for (int i = 1; i < args.length; i++) {
                yourCity.append(" " + args[i]);
            }

            Position[] response = new GoEuroClient().getPosition(yourCity);
            CsvWriterFile.writeToCsv(response, yourCity);
        }

    }


}
