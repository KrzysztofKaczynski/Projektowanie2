import java.util.Observable;
import java.util.Observer;

public class Uzytkownik implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("UWAGA! ZAGROZENIE W OBSZARZE! TYP ZAGROZENIA: " + ((Zagrozenie)arg).name());
    }
}
