package firma;

/**
 * 3. Stwórz klasę Projekt, która będzie miała następujące pola:
 * ⦁	nazwa oprogramowania
 * ⦁	cena za to oprogramowanie
 * ⦁	status, mówiący czy projekt jest skończony
 */
public class Projekt {

    private String nazwaApp;
    private double cenaApp;
    private boolean isFinish;

    public String getNazwaApp() {
        return nazwaApp;
    }

    public void setNazwaApp(String nazwaApp) {
        this.nazwaApp = nazwaApp;
    }

    public double getCenaApp() {
        return cenaApp;
    }

    public void setCenaApp(double cenaApp) {
        this.cenaApp = cenaApp;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    @Override
    public String toString() {
        return "Projekt{" +
                "nazwaApp='" + nazwaApp + '\'' +
                ", cenaApp=" + cenaApp +
                ", isFinish=" + isFinish +
                '}';
    }

    public Projekt(String nazwaApp, double cenaApp, boolean isFinish) {
        this.nazwaApp = nazwaApp;
        this.cenaApp = cenaApp;
        this.isFinish = isFinish;
    }
    public void nowyProjekt(){

    }


}
