import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

    int testNumber;
    @Before
    public void setUp() {
        testNumber = 5;
    }
    @Test
    public void testRecursive() {
        int result = Factorial.recursiveFactorial(testNumber);
        Assert.assertEquals(120, result);
    }

    @Test
    public void testIterative() {
        int result = Factorial.iterativeFactorial(testNumber);
        Assert.assertEquals(120, result);
    }

    @Test
    public void compareResults() {
        int resultRecursive = Factorial.recursiveFactorial(testNumber);
        int resultIterative = Factorial.iterativeFactorial(testNumber);
        Assert.assertEquals(resultIterative, resultRecursive);
    }
}
