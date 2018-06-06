package firma;

import java.time.LocalDate;
abstract class PracownikWydzialu extends Pracownik {


    private double premia;
    private String stanowisko;

    public PracownikWydzialu(int id, String imie,
                             String nazwisko,
                             LocalDate localDate,
                             double zarobki,
                             double premia,
                             String stanowisko) {
        super(id, imie, nazwisko, localDate, zarobki);
        this.premia = premia;
        this.stanowisko = stanowisko;
    }
}
