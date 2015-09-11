package test.com.goeuroJavaTest.goeuroGeoLogLat;

import com.goeuroJavaTest.goeuroGeoLogLat.GeoLogLat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * GeoLogLat Tester.
 *
 * @author Satyaban Pradhan
 * @version 1.0
 * @since Sep 12, 2015
 */
public class GeoLogLatTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getLatitude()
     */
    @Test
    public void testGetLatitude() throws Exception {
        GeoLogLat e0Obj = new GeoLogLat();
        double e0 = e0Obj.getLongitude();
    }

    /**
     * Method: getLongitude()
     */
    @Test
    public void testGetLongitude() throws Exception {
        GeoLogLat e0Obj = new GeoLogLat();
        double e0 = e0Obj.getLatitude();
    }

    /**
     * Method: equals(Object o)
     */
    @Test
    public void testEquals() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: hashCode()
     */
    @Test
    public void testHashCode() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: toString()
     */
    @Test
    public void testToString() throws Exception {
//TODO: Test goes here... 
    }

    @Test

    public void testSequence() {

        GeoLogLat e0Obj = new GeoLogLat();

        e0Obj.getLongitude();

        e0Obj.getLongitude();

        e0Obj.getLongitude();

        double e0 = e0Obj.getLongitude();

        double e1 = e0Obj.getLatitude();

        double e2 = e0Obj.getLatitude();

        double e3 = e0Obj.getLatitude();

        double e4 = e0Obj.getLongitude();

        double e5 = e0Obj.getLongitude();

        double e6 = e0Obj.getLongitude();

        double e7 = e0Obj.getLatitude();

        double e8 = e0Obj.getLatitude();

        double e9 = e0Obj.getLatitude();

    }


} 
