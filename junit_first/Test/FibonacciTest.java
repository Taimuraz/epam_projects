import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class FibonacciTest {
    private Fibonacci fb = new Fibonacci();

//    @Before
    public void setup(){
        fb = new Fibonacci();
    }

    @Test
    public void testBaseCase(){
        int[] expected = {0, 1, 1, 2, 3 ,5, 8, 13, 21, 34, 55};


        for (int i = 1; i < expected.length; i++) {
            int act = fb.getNumber(i);
            Assert.assertEquals(String.format("The %dth index must be %d",i, expected[i]),expected[i],act);
        }
    }


    @Test
    public void testLowerBound(){
        int act = fb.getNumber(4);
        try{
            fb.getNumber(0);
            fail("0 element must throe an exception.");
        }catch ( IllegalArgumentException e){

        }
    }




}