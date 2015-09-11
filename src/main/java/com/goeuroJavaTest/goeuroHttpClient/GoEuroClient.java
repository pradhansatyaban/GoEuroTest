package com.goeuroJavaTest.goeuroHttpClient;

import com.goeuroJavaTest.goeuroAppUtil.GoEuroReadProperties;
import com.goeuroJavaTest.goeuroPosition.Position;
import com.goeuroJavaTest.goeuroException.HttpResponseException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang3.StringUtils;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static java.lang.String.format;


/*
 * Created by Satyaban Pradhan
 *              on 09/09/2015
 */

public class GoEuroClient {
    private static final Logger logger = LoggerFactory.getLogger(GoEuroClient.class);

    public Position[] getPosition(final StringBuilder city) throws HttpResponseException {
        if (StringUtils.isEmpty(city) || StringUtils.isBlank(city)) {
            throw new IllegalArgumentException("City is Blank");
        }
        String trimLocation = city.toString().trim().replace(" ", "%20");

        final HttpClient httpClient = new HttpClient();
        final String url = buildURL(trimLocation);
        final HttpMethod method = new GetMethod(url);

        try {
            int status = httpClient.executeMethod(method);
            if (status != HttpStatus.SC_OK) {
                final String msg = "REST API return error: %s";
                throw new HttpResponseException(format(msg, url), status);
            }
            final String response = method.getResponseBodyAsString();
            Position[] data = convert(response);
            return data;

        } catch (HttpException e) {
            logger.error("HttpException :", e.getMessage());
            throw new HttpResponseException(e.getMessage());
        } catch (IOException e) {
            logger.error("IOException : ", e.getMessage());
            throw new HttpResponseException(e.getMessage());
        } finally {
            method.releaseConnection();
        }
    }
    //Convert JSON to java object
    private Position[] convert(final String response) {
        final Gson gson = new Gson();
        return gson.fromJson(response, Position[].class);
    }
    //Get Path From Properties file and  build the url
        private String buildURL(final String city) {
        StringBuilder stringBuilder = new StringBuilder(GoEuroReadProperties.getPath());
        stringBuilder.append(city);
        return stringBuilder.toString();
    }


}
