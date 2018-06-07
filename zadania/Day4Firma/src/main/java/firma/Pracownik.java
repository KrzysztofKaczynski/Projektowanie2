package firma;

import java.time.LocalDate;

abstract class Pracownik {
/*
⦁	zarobki
⦁	imie
⦁	nazwisko
⦁	data rozpoczęcia pracy
⦁	id, które będzie unikalne dla każdego pracownika
*/

    private int id;
    private String imie;
    private String nazwisko;
    private LocalDate localDate;
    private double zarobki;

    public void setZarobki(double zarobki) {
        this.zarobki = zarobki;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", localDate=" + localDate +
                ", zarobki=" + zarobki +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Pracownik(int id, String imie, String nazwisko, LocalDate localDate, double zarobki) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.localDate = localDate;
        this.zarobki = zarobki;
    }
}