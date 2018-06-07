package firma;

import java.time.LocalDate;
abstract class PracownikWydzialu extends Pracownik {


    private double premia;
    private Stanowisko stanowisko;

    public void setPremia(double premia) {
        this.premia = premia;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getPremia() {
        return premia;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public PracownikWydzialu(int id, String imie,
                             String nazwisko,
                             LocalDate localDate,
                             double zarobki,
                             double premia,
                             Stanowisko stanowisko) {
        super(id, imie, nazwisko, localDate, zarobki);
        this.premia = premia;
        this.stanowisko = stanowisko;
    }
}
