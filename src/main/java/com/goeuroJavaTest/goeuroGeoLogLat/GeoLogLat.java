package com.goeuroJavaTest.goeuroGeoLogLat;


/*
 * Created by Satyaban Pradhan
 *              on 28/08/2015
 */

public class GeoLogLat {

    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoLogLat)) return false;

        GeoLogLat that = (GeoLogLat) o;

        if (Double.compare(that.latitude, latitude) != 0) return false;
        return Double.compare(that.longitude, longitude) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(latitude);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "GeoLogLat [latitude=" + latitude + ", longitude=" + longitude + "]";
    }

}

