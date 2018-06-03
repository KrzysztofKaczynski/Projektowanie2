import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class TestUser implements Observer {
    List<Object> messagesReceived = new ArrayList<Object>();
    @Override
    public void update(Observable o, Object arg) {
        messagesReceived.add(arg);
    }
}
