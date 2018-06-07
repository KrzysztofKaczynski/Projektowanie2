package firma;

import java.time.LocalDate;

public class Kierownik extends Pracownik {


    private String wydzial;


    public Kierownik(int id, String imie, String nazwisko, LocalDate localDate, double zarobki, String wydzial) {
        super(id, imie, nazwisko, localDate, zarobki);
        this.wydzial = wydzial;
    }
}

