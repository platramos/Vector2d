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
        assertThat(vectorOne.asString(), containsString("1"));
    }



    @Test
    public void createXValueVector(){
      assertEquals(1.0, vectorOne.getXCoord(), .05);
    }
    @Test
    public void createYValueVector(){
        assertEquals(2.0, vectorOne.getYCoord(), .05);
    }
    @Test
    public void testSumOfVectors(){
        assertEquals(new SimpleVector(4,6), (VectorMath.add(vectorOne, vectorTwo)));
    }
    @Test
    public void testDiffOfVectors(){
        assertEquals(new SimpleVector(-2,-2), VectorMath.subtract(new SimpleVector(1, 2), new SimpleVector(3, 4)));
    }
    @Test
    public void testDotProductOfVectors(){
        double result = vectorOne.dot(vectorTwo);

        double dotProduct = vectorOne.getXCoord() * vectorTwo.getXCoord() + vectorOne.getYCoord() * vectorTwo.getYCoord();
        assertEquals(dotProduct, VectorMath.product(new SimpleVector(1, 2), new SimpleVector(3, 4)), .05);
    }
    @Test
    public void testfindLengthOfVector(){
       double length = vectorOne.getXCoord()*vectorOne.getXCoord() + vectorOne.getYCoord()*vectorOne.getYCoord();
        assertEquals(length, vectorOne.getLength(), .05);
    }
}
