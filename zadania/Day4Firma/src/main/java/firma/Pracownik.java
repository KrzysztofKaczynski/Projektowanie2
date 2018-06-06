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

    public Pracownik(int id, String imie, String nazwisko, LocalDate localDate, double zarobki) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.localDate = localDate;
        this.zarobki = zarobki;
    }
}