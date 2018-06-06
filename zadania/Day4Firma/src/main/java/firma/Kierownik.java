package firma;

import java.time.LocalDate;

public class Kierownik extends Pracownik {
    public Kierownik(int id, String imie, String nazwisko, LocalDate localDate, double zarobki) {
        super(id, imie, nazwisko, localDate, zarobki);
    }
}
