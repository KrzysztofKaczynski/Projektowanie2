
import base.Capuccino;
import condiments.Condiment;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EkspresTest {
    @Test
    public void testBuilderCreatesProperClass() {

        Coffee.Builder builder = new Coffee.Builder(new Capuccino())
                .addBrownSugar()
                .addSoyMilk()
                .addVanillaSyrup()
                .addWhiteSugar()
                .addWhippedCream();
        List<Condiment> builderCondiments = builder.getCondiments();
        Coffee coffee = builder.build();
        Assert.assertTrue(coffee.getCoffeeBase() instanceof Capuccino);
        Assert.assertEquals(5, coffee.getCondiments().size());
        Assert.assertArrayEquals(builderCondiments.toArray(), coffee.getCondiments().toArray());
    }
}
