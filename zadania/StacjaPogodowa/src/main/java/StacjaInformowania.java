import java.util.Observable;

public class StacjaInformowania extends Observable {

    public void poinformujOZagrozeniu(Zagrozenie zagrozenie) {
        setChanged();
        notifyObservers(zagrozenie);
    }
}
