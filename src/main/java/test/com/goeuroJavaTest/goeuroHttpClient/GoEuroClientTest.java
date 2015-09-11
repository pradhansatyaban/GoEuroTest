package test.com.goeuroJavaTest.goeuroHttpClient;

import com.goeuroJavaTest.goeuroHttpClient.GoEuroClient;
import com.goeuroJavaTest.goeuroPosition.Position;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;


/**
 * GoEuroClient Tester.
 *
 * @author Satyaban Pradhan
 * @version 1.0
 * @since Sep 11, 2015
 */
public class GoEuroClientTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getPosition(final StringBuilder city)
     */
    @Test
    public void testGetPosition() throws Exception {
        GoEuroClient e0Obj = new GoEuroClient();
        try {
            Position[] e0 = e0Obj.getPosition(null);
        } catch (Exception e) {
            fail();
        }
    }


    /**
     * Method: convert(final String response)
     */
    @Test
    public void testConvert() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = GoEuroClient.getClass().getMethod("convert", final.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: buildURL(final String city)
     */
    @Test
    public void testBuildURL() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = GoEuroClient.getClass().getMethod("buildURL", final.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }


    @Test

    public void testSequence() {

        GoEuroClient e0Obj = new GoEuroClient();

        StringBuilder e0Arg0 = new StringBuilder(null);

        try {

            Position[] e0 = e0Obj.getPosition(e0Arg0);

        } catch (Exception e) {

            fail();

        }


        StringBuilder e1Arg0 = new StringBuilder(null);
        try {
            Position[] e1 = e0Obj.getPosition(e1Arg0);
        } catch (Exception e) {

            fail();

        }

        StringBuilder e2Arg0 = new StringBuilder(-51);

        try {

            Position[] e2 = e0Obj.getPosition(e2Arg0);

        } catch (Exception e) {

            fail();

        }

        StringBuilder e3Arg0 = new StringBuilder(54);

        try {

            Position[] e3 = e0Obj.getPosition(e3Arg0);

        } catch (Exception e) {

            fail();

        }

        StringBuilder e4Arg0 = new StringBuilder(null);

        try {

            Position[] e4 = e0Obj.getPosition(e4Arg0);

        } catch (Exception e) {

            fail();

        }

        StringBuilder e5Arg0 = new StringBuilder("(Y");

        try {

            Position[] e5 = e0Obj.getPosition(e5Arg0);

        } catch (Exception e) {

            fail();

        }

        StringBuilder e6Arg0 = new StringBuilder();

        try {

            Position[] e6 = e0Obj.getPosition(e6Arg0);

        } catch (Exception e) {

            fail();

        }

        StringBuilder e7Arg0 = new StringBuilder();

        e7Arg0.lastIndexOf("Xi,EJ", -1);

        e7Arg0.append(false);

        e7Arg0.insert(86, 'j');

        char[] e7Arg03Arg0 = new char[18];

        e7Arg03Arg0[0] = '1';

        e7Arg03Arg0[1] = '6';

        e7Arg03Arg0[2] = 'b';

        e7Arg03Arg0[3] = 'j';

        e7Arg03Arg0[4] = '1';

        e7Arg03Arg0[5] = 'z';

        e7Arg03Arg0[6] = 'F';

        e7Arg03Arg0[7] = 'f';

        e7Arg03Arg0[8] = ';';

        e7Arg03Arg0[9] = 'T';

        e7Arg03Arg0[10] = 'Z';

        e7Arg03Arg0[11] = 'p';

        e7Arg03Arg0[12] = 'r';

        e7Arg03Arg0[13] = '<';

        e7Arg03Arg0[14] = '&';

        e7Arg03Arg0[15] = 'J';

        e7Arg03Arg0[16] = 'd';

        e7Arg03Arg0[17] = 'J';

        e7Arg0.append(e7Arg03Arg0);

        try {

            Position[] e7 = e0Obj.getPosition(e7Arg0);

        } catch (Exception e) {

            fail();

        }

        StringBuilder e8Arg0 = new StringBuilder();

        try {

            Position[] e8 = e0Obj.getPosition(e8Arg0);

        } catch (Exception e) {

            fail();

        }

        StringBuilder e9Arg0 = new StringBuilder(-78);

        try {

            Position[] e9 = e0Obj.getPosition(e9Arg0);

        } catch (Exception e) {

            fail();

        }
    }


} 
