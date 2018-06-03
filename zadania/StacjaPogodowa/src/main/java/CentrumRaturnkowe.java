import java.util.Observable;
import java.util.Observer;

public class CentrumRaturnkowe implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("CENTRUM RATUNKOWE OTRZYMALO INFORMACJE O ZAGROZENIU: " +  ((Zagrozenie)arg).name() + ".WYSYLANIE SLUZB RATUNKOWYCH!" ) ;
    }
}
