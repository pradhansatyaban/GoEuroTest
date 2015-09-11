package test.com.goeuroJavaTest.goeuroCSVWriter;

import com.goeuroJavaTest.goeuroCSVWriter.CsvWriterFile;
import com.goeuroJavaTest.goeuroGeoLogLat.GeoLogLat;
import com.goeuroJavaTest.goeuroPosition.Position;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * CsvWriterFile Tester.
 *
 * @author Satyaban Pradhan
 * @version 1.0
 * @since Sep 11, 2015
 */
public class CsvWriterFileTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: writeToCsv(final Position[] response, StringBuilder yourCity)
     */
    @Test
    public void testWriteToCsv() throws Exception {


        // @Test //public static void writeToCsv(Position[],StringBuilder)

        Position[] e0Arg0 = new Position[8];

        Position e0Arg0Com0 = new Position();

        e0Arg0[0] = e0Arg0Com0;

        Position e0Arg0Com1 = new Position();

        e0Arg0[1] = e0Arg0Com1;

        Position e0Arg0Com2 = new Position();

        GeoLogLat e0Arg0Com20Arg0 = new GeoLogLat();

        e0Arg0Com20Arg0.getLongitude();

        e0Arg0Com20Arg0.getLatitude();

        e0Arg0Com2.setGeoLogLat(e0Arg0Com20Arg0);

        e0Arg0[2] = e0Arg0Com2;

        Position e0Arg0Com3 = new Position();

        e0Arg0[3] = e0Arg0Com3;

        Position e0Arg0Com4 = new Position();

        e0Arg0[4] = e0Arg0Com4;

        Position e0Arg0Com5 = new Position();

        e0Arg0Com5.setCountry("MJSaQpYs\"QGIda8@#?");

        e0Arg0[5] = e0Arg0Com5;

        Position e0Arg0Com6 = new Position();

        e0Arg0[6] = e0Arg0Com6;

        Position e0Arg0Com7 = new Position();

        e0Arg0Com7.setType("}3n");

        e0Arg0Com7.getType();

        e0Arg0Com7.getLocationId();

        e0Arg0[7] = e0Arg0Com7;

        StringBuilder e0Arg1 = new StringBuilder(":(89jDWvov=O");

        try {

            CsvWriterFile.writeToCsv(e0Arg0, e0Arg1);

        } catch (Exception e) {

            fail();

        }

    }

}


