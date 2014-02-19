import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

/**
 * Created by Justin on 2/12/14.
 */
public class testVectors {

    SimpleVector vectorOne;
    SimpleVector vectorTwo;

    @Before
    public void createTestVectors(){
        vectorOne = new SimpleVector(1, 2);
        vectorTwo = new SimpleVector(3, 4);
    }

    @Test
    public void shouldReportXCoordinate(){
        assertThat(vectorOne.toString(), containsString("1"));
    }

    @Test
    public void testSumOfVectors(){
        assertThat(vectorOne.add(vectorTwo), containsString("<4.0, 6.0>"));
    }

    @Test
    public void testDifferenceOfVectors(){
        assertThat(vectorOne.subtract(vectorTwo), containsString("<-2.0, -2.0>"));
    }

    @Test
    public void testDotProductOfVectors(){
        assertThat(vectorOne.dot(vectorTwo), containsString("11"));
    }

    @Test
    public void testfindLengthOfVector(){
       double length = vectorOne.getXCoord()*vectorOne.getXCoord() + vectorOne.getYCoord()*vectorOne.getYCoord();
        assertThat(vectorTwo.lengthAsString(), containsString("5"));
    }
}

