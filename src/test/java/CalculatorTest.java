
import static org.junit.Assert.*;

import org.example.App;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    App app = new App();

    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial of a number for True Positive", 6, app.factorial(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 720, app.factorial(6), DELTA);
    }

    @Test
    public void factorialTrueNegative() {
        assertNotEquals("Finding factorial of a number for True Negative", 69, app.factorial(5), DELTA);
        assertNotEquals("Finding factorial of a number for True Negative", 42, app.factorial(10), DELTA);
    }

    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 32, app.power(2, 5), DELTA);
        assertEquals("Finding power for True Positive", 81, app.power(9, 2), DELTA);
    }

    @Test
    public void powerTrueNegative() {
        assertNotEquals("Finding power for True Negative", 69, app.power(2, 2), DELTA);
        assertNotEquals("Finding power for True Negative", -69420, app.power(-2, 20), DELTA);
    }

    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, app.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 5.703782474656201, app.naturalLog(300), DELTA);
    }

    @Test
    public void logTrueNegative() {
        assertNotEquals("Finding natural log for True Negative", 69, app.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for True Negative", 420, app.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive() {
        assertEquals("Finding square root for True Positive", 11, app.squareRoot(121), DELTA);
        assertEquals("Finding square root for True Positive", 121, app.squareRoot(14641), DELTA);
    }

    @Test
    public void sqrootTrueNegative() {
        assertNotEquals("Finding square root for True Negative", 69, app.squareRoot(3), DELTA);
        assertNotEquals("Finding square root for True Negative", -42, app.squareRoot(4), DELTA);
    }


}


// Comments to test webhook