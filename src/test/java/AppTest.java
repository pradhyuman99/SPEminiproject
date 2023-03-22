import org.example.App;
import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.Math;

public class AppTest {

    private static final double DELTA = 1e-15;
    App calculate= new App();

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power", 512, calculate.power(8,3), DELTA);

    }
    @Test
    public void powerFalsePositive() {
        assertNotEquals("Finding power", 120, calculate.power(10, 4), DELTA);

    }


    @Test
    public void logTruePositive(){
        assertEquals("Finding log", 1, calculate.naturallog(Math.exp(1)), DELTA);

    }
    @Test
    public void logFalsePositive() {
        assertNotEquals("Finding log", 120, calculate.naturallog(10), DELTA);

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
