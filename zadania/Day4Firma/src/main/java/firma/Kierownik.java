package firma;
/**
 * . Zaimplementuj w klasie Kieorwnik metody przyznajPodwyzke
 * (List<PracownikWydzialu> pracownik, BigDecimal sumaPodwyzki)
 * i awansuj(PracownikWydzialu pracownik, Stanowisko noweStanowisko).
 * Które odpowiednio będą odpowiednio przyznawały pracownikom podwyżki
 * i przyznawały awanse. Jeżeli do którejś z tych metod zostanie przekazany pracownik,
 * który nie pracuje w danym wydziale metoda powinna rzucić zaimplementowany przez Ciebie wyjątek
 * ZłyWydziałException.
 */

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Kierownik extends Pracownik {


    private Wydzial wydzial;
    private BigDecimal sumaPodwyzki;

    public void setWydzial(Wydzial wydzial) {
        this.wydzial = wydzial;
    }

    public void setSumaPodwyzki(BigDecimal sumaPodwyzki) {
        this.sumaPodwyzki = sumaPodwyzki;
    }

    public Kierownik(int id, String imie, String nazwisko, LocalDate localDate,
                     double zarobki, Wydzial wydzial, BigDecimal sumaPodwyzki,
                     List<PracownikWydzialu> pracownikWydzialus) {
        super(id, imie, nazwisko, localDate, zarobki);
        this.wydzial = wydzial;
        this.sumaPodwyzki = sumaPodwyzki;
    }

    public Kierownik(int id, String imie, String nazwisko, LocalDate localDate,
                     double zarobki, Wydzial wydzial) {
        super(id, imie, nazwisko, localDate, zarobki);
        this.wydzial = wydzial;
    }


    public void awansuj(PracownikWydzialu pracownikWydzialu, Stanowisko stanowisko) {
        if (wydzial.getPracownicykWydzialu().contains(pracownikWydzialu)) ;
        pracownikWydzialu.setStanowisko(stanowisko);

    }

    public void podwyzka(List<PracownikWydzialu> pracownik, BigDecimal sumaPodwyzki) {
        if (wydzial.getPracownicykWydzialu().containsAll(pracownik)) {

        }
        for (int i = 0; i < pracownik.size(); i++) {
            pracownik.get(i);

        }
        /**
         * 11. Zaimplementuj w klasie Kierownik metody
         * •	znajdzWolnychProgramistow(), która zwróci wszystkich programistów, którzy nie mają obecnie projektu
         * •	przypiszProjekt(Programista programista, Projekt nazwaProjektu), która przypisze danemu programiscie projekt.
         *          Jeżeli programista nie pracuje w dziale za który odpowiada dany kierownik, należy rzucić ZlyWydzialException().
         * •	stwórzNowyProjekt(Projekt nazwaProjektu), która przypisze projekt nazwaProjektu,
         *          wszystkim obecnie wolnym programistom projekt nazwaProjektu.
         * •	skończProjekt(Projekt nazwaProjektu), która przypisze pustą opcje w polu projekt wszystkim programistą,
         *          którzy obecnie pracują w projekcie nazwaProjektu
         */
    }

    public void znajdzWolnychProgramistow(Programista wolnyProgramista, Projekt nowyProjekt) {
        znajdzWolnychProgramistow(wolnyProgramista, nowyProjekt);

    }

    public void przypiszProjekt(Programista wolnyProgramista, Projekt nazwaProjektu) {
        przypiszProjekt(wolnyProgramista, nazwaProjektu);
    }

    public void stworzNowyProjekt(Projekt nazwaProjektu) {
        stworzNowyProjekt(nazwaProjektu);
    }

    public void skonczProjekt(Projekt nazwaProjektu) {
        skonczProjekt(nazwaProjektu);
    }
}


