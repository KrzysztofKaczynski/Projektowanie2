import dzien2.option.GenericOption;
import dzien2.option.NoValueException;
import org.junit.Assert;
import org.junit.Test;

public class GenericOptionTest {

    @Test
    public void getTest() throws NoValueException {
        GenericOption<Integer> integerGenericOption = new GenericOption<>(5);
        Assert.assertEquals(5, integerGenericOption.get().intValue());
    }

    @Test
    public void testEmptyOption() {
        GenericOption emptyOption = GenericOption.empty();
        Assert.assertFalse(emptyOption.isSet());
    }

    @Test
    public void testSetEmptyOption() throws NoValueException {
        GenericOption<Integer> toSetOption = GenericOption.empty();
        Assert.assertFalse(toSetOption.isSet());
        toSetOption.set(100);
        Assert.assertTrue(toSetOption.isSet());
        Assert.assertEquals(100, toSetOption.get().intValue());
    }

    @Test(expected = NoValueException.class)
    public void testEmptyGet() throws NoValueException {
        GenericOption emptyOption = GenericOption.empty();
        emptyOption.get();
    }
}
