package firma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Zaimplementuj klasę Przedsiebiorstwo, która będzie zawierała następujące pola :
 * ⦁	kierownictwo, zawierające listę wszystkich kierowników w przedsiębirostwie
 * ⦁	nazwa, zawierające nazwę przedsiębiorstwa
 * ⦁	dochód, zawierające sumę dochodów przedsiębiorstwa
 * ⦁	projektyAktywne, zawierające mapę aktywnych projektów i kierowników za nie odpowiedzialnych
 * ⦁	projektyZakończone, zawierająceListę zakończonych projektów
 */

public class Firma {
    private String nazwaFirmy;
    private List<Kierownik> kierownikList = new ArrayList<>();
    private double dochodyFirmy;
    private Map<Projekt, Kierownik>projektKierownikMap = new HashMap<>();
    private List<Projekt>isFinishProjekt = new ArrayList<>();


}
