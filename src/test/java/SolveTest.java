import org.example.Solve;
import static org.junit.Assert.*;
import org.junit.Test;

public class SolveTest {

    private static final double DELTA = 1e-15;
    Solve calculate= new Solve();

    @Test
    public void multiplyTruePositive(){
        assertEquals("Finding multiplication of two number for True Positive", 24, calculate.multiply(8,3), DELTA);

    }
    @Test
    public void multiplyFalsePositive() {
        assertNotEquals("Finding multiplication of two number for False Positive", 120, calculate.multiply(10, 4), DELTA);

    }


    @Test
    public void divideTruePositive(){
        assertEquals("Finding division of two number for True Positive", 8, calculate.divide(48,6), DELTA);

    }
    @Test
    public void divideFalsePositive() {
        assertNotEquals("Finding division of two number for False Positive", 120, calculate.divide(10, 4), DELTA);

    }


    @Test
    public void minusTruePositive(){
        assertEquals("Finding sub of two number for True Positive", 24, calculate.minus(60,36), DELTA);

    }
    @Test
    public void minusFalsePositive() {
        assertNotEquals("Finding sub of two number for False Positive", 120, calculate.minus(10, 4), DELTA);

    }


    @Test
    public void sumTruePositive(){
        assertEquals("Finding sum of two number for True Positive", 24, calculate.sum(8,16), DELTA);

    }
    @Test
    public void sumFalsePositive() {
        assertNotEquals("Finding sum of two number for False Positive", 120, calculate.sum(10, 4), DELTA);

    }





   }
