public class Main {
    public static void main(String[] args) {
        StacjaInformowania stacjaInformowania = new StacjaInformowania();
        Uzytkownik uzytkownik = new Uzytkownik();
        CentrumRaturnkowe centrumRaturnkowe = new CentrumRaturnkowe();
        stacjaInformowania.addObserver(centrumRaturnkowe);
        stacjaInformowania.addObserver(uzytkownik);
        stacjaInformowania.poinformujOZagrozeniu(Zagrozenie.ZAMIEC);

    }
}
