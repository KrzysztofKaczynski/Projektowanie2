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
}
