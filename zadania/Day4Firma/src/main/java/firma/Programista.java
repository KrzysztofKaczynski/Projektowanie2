package firma;

import java.time.LocalDate;
import java.util.Optional;

public class Programista  extends PracownikWydzialu{


    private String jezykProg;
    private Optional<String> projekt;

    public Programista(int id, String imie, String nazwisko, LocalDate localDate, double zarobki, double premia, String stanowisko, String jezykProg, Optional<String> projekt) {
        super(id, imie, nazwisko, localDate, zarobki, premia, stanowisko);
        this.jezykProg = jezykProg;
        this.projekt = projekt;
    }
}
