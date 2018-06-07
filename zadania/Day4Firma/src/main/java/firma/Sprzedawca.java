package firma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sprzedawca extends PracownikWydzialu{


   private List<Projekt> sellApp = new ArrayList<>();
    private double sellAppPrice;

    public Sprzedawca(int id, String imie, String nazwisko, LocalDate localDate,
                      double zarobki, double premia, String stanowisko,
                      List<Projekt> sellApp, double sellAppPrice) {

        super(id, imie, nazwisko, localDate, zarobki, premia, stanowisko);
        this.sellApp = sellApp;
        this.sellAppPrice = sellAppPrice;
    }
}
