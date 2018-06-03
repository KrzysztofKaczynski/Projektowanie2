import org.junit.Assert;
import org.junit.Test;

public class ArrayFinderTest {

    @Test
    public void testEmptyArray(){
        int[] ints = new int[0];
        int result = ArrayFinder.findSecondSmallestNumberInArray(ints);
        Assert.assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void testDifferentNumbers(){
        int[] ints = {0, 1, 2, 3, 4 ,5 ,6 };
        int result = ArrayFinder.findSecondSmallestNumberInArray(ints);
        Assert.assertEquals(1, result);
    }
    @Test
    public void testAllNumbersTheSame(){
        int[] ints = {1, 1, 1, 1, 1, 1};
        int result = ArrayFinder.findSecondSmallestNumberInArray(ints);
        Assert.assertEquals(Integer.MAX_VALUE, result);
    }
    @Test
    public void testNegativeNumbers(){
        int[] ints = {-1,-5,-7,-4,-2,-1};
        int result = ArrayFinder.findSecondSmallestNumberInArray(ints);
        Assert.assertEquals(-5, result);
    }
}
