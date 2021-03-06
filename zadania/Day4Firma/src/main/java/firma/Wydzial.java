package firma;

        import java.util.*;

public class Wydzial {


    private String nazwaDep;
    private Set<PracownikWydzialu> pracownicykWydzialu = new HashSet<>();

    public Set<PracownikWydzialu> getPracownicykWydzialu() {
        return pracownicykWydzialu;
    }

    /**
     * . Zaimplementuj w klasie Wydział metody zartudnij(PracownikWydzialu pracownik)
     * i zwolnij(PracownikWydzialu pracownik), która pozwoli zatrudnić i zwolnić nowego pracownika.
     * Jeżeli podany pracownik pracuje już w tym dziale to metoda powinna rzucić nowy
     * zaimplementowany przez Ciebie wyjątek PracownikJuzZatrudnionyException().
     * Jeżeli natomiast zostanie podjeta próba zwolnienia pracownika,
     * który nie pracuje w danym wydziale, należy rzucić wyjątek BrakPracownikaException.
     * Jeżeli zaś zostanie podjęta próba zatrudniania 2 sprzedawcy, należy rzucić wyjątek
     * SprzedawcaZatrudnionyException.
     */


    public void zatrudnij(PracownikWydzialu pracownikWydzialu) throws PracowniWydziałuExeption, SprzedawcaZatrudnionyException {


        if (pracownikWydzialu != null) {
            if (pracownicykWydzialu.contains(pracownikWydzialu)) {

                throw new PracowniWydziałuExeption();
            } else if
                    (pracownicykWydzialu.contains(Stanowisko.SPRZEDAWCA)) {
                throw new SprzedawcaZatrudnionyException();
            }
        } else {
            pracownicykWydzialu.add(pracownikWydzialu);
        }
    }


    public void zwolnij(PracownikWydzialu pracownikWydzialu) throws PracownikJuzZatrudException {
        if (pracownikWydzialu != null) {
            if (pracownicykWydzialu.contains(pracownikWydzialu)) {
                throw new PracownikJuzZatrudException();
            } else {
                pracownicykWydzialu.remove(pracownikWydzialu);
            }
        }
    }

    /**
     * Zaimplementuj w klasie Wydział metodę przyznajPremie(int premia),
     * która przyznaje premie wszystkim pracownikom wydziału.
     */
    public void przyznajPremie(PracownikWydzialu pracownikWydzialu) {
        pracownikWydzialu.setPremia(2000);

    }
}