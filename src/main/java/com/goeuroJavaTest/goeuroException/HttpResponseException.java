package com.goeuroJavaTest.goeuroException;


/*
 * Created by Satyaban Pradhan
 *              on 28/08/2015
 * Wrapper class for exceptions created during CSV extraction of user data
 */

public class HttpResponseException extends Exception {

    public HttpResponseException(String message, int statusCode) {
        super(message);
    }

    public HttpResponseException(String message) {
        super(message);
    }

}
