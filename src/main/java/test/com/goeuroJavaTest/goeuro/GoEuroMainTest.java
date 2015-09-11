package test.com.goeuroJavaTest.goeuro;

import com.goeuroJavaTest.goeuro.GoEuroMain;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * GoEuroMainTest Tester.
 *
 * @author Satyaban Pradhan
 * @version 1.0
 * @since Sep 11, 2015
 */

public class GoEuroMainTest {

    @Test //public static void main(String[])

    public void testMain() {

        String[] e0Arg0 = new String[0];

        try {

            GoEuroMain.main(e0Arg0);

        } catch (Exception e) {

            fail();

        }

    }


    @Test

    public void testSequence() {

        String[] e0Arg0 = new String[13];
        e0Arg0[0] = ":K";

        e0Arg0[1] = "|\\_ne*9FT{5B";

        e0Arg0[2] = "X4dKW}=@z1%IThZy";

        e0Arg0[3] = "6X;RDfWYD]Ht4f";

        e0Arg0[4] = "Q(,r}(-pbP3[";

        e0Arg0[5] = "lB==\\xU&,PR";

        e0Arg0[6] = "";

        e0Arg0[7] = ")0";

        e0Arg0[8] = "EQe,$e6unN";

        e0Arg0[9] = ";n_C";

        e0Arg0[10] = "";

        e0Arg0[11] = "Gq";

        e0Arg0[12] = "3^Kq!%[|w";

        try {

            GoEuroMain.main(e0Arg0);

        } catch (Exception e) {

            fail();

        }

    }

}
