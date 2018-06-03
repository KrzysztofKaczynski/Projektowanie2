import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StacjaTest {
    TestUser user;

    @Before
    public void setUp() {
        user = new TestUser();
    }

    @Test
    public void testBezWiadomosci() {
        StacjaInformowania stacjaInformowania = new StacjaInformowania();
        stacjaInformowania.addObserver(user);
        Assert.assertEquals(0, user.messagesReceived.size());
    }

    @Test
    public void testJednaWiadomość() {
        StacjaInformowania stacjaInformowania = new StacjaInformowania();
        stacjaInformowania.addObserver(user);
        stacjaInformowania.poinformujOZagrozeniu(Zagrozenie.ZAMIEC);
        Assert.assertEquals(1, user.messagesReceived.size());
        Assert.assertEquals(Zagrozenie.ZAMIEC, user.messagesReceived.get(0));
    }

    @Test
    public void testDwieWiadomośći() {
        StacjaInformowania stacjaInformowania = new StacjaInformowania();
        stacjaInformowania.addObserver(user);
        stacjaInformowania.poinformujOZagrozeniu(Zagrozenie.ZAMIEC);
        stacjaInformowania.poinformujOZagrozeniu(Zagrozenie.POZAR);
        Assert.assertEquals(2, user.messagesReceived.size());
        Assert.assertEquals(Zagrozenie.ZAMIEC, user.messagesReceived.get(0));
        Assert.assertEquals(Zagrozenie.POZAR, user.messagesReceived.get(1));

    }

}
