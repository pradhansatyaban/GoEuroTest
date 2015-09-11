package com.goeuroJavaTest.goeuroException;


/*
 * Created by Satyaban Pradhan
 *              on 28/08/2015
 */

public class CsvWriterException extends Exception {
    private static final long serialVersionUID = -7373766109698741236L;

    public CsvWriterException() {
        super();
    }

    public CsvWriterException(String message) {
        super(message);
    }
}