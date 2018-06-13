package immutabilty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaInteger {
    public static void main(String[] args) {
/**
*   4.	Stwórz listę z liczbami całkowitymi.
*      *     Następnie wywołaj funkcję liczącą sumę wartości bezwzględnych,
*      *     a potem funkcję liczącą sumę. Co się stało?
*   5.	Podczas wywołania funkcji liczącej sumę wartości bezwzględnych podaj do niej swoją listę,
 *      ale zapakuj ją w metodę Collections.unmodifiableList . Czyli np. zamiast absoluteSum(list),
 *      będziemy mieli absoluteSum(Collections.unmodifiableList(list)) . Co się wtedy dzieje?
*/

        List<Integer> listLiczbyCalk = new ArrayList<>();
        listLiczbyCalk.add(-11);
        listLiczbyCalk.add(-5);
        listLiczbyCalk.add(1);
        listLiczbyCalk.add(2);
        listLiczbyCalk.add(3);
        listLiczbyCalk.add(4);

        System.out.println(listLiczbyCalk);
        System.out.println(wartBezSum(Collections.unmodifiableList(listLiczbyCalk)));
        System.out.println(listLiczbyCalk);
        System.out.println(sumInt(listLiczbyCalk));

    }

/**1.	Napisz funkcję, która zwraca sumę wartości listy integerów.*/

    public static Integer sumInt(List<Integer> list) {
        return list.stream().mapToInt(e -> e).sum();
    }

/** 2.	Napisz funkcję, która przyjmuje listę integerów i zamienia liczby na ich wartości bezwzględne.*/

    public static void wartBez(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.set(i, -list.get(i));
            }
        }
    }

/** 3.	Napisz funkcję (wykorzystując powyższe), która sumuje wartości bezwzględne z listy integerów.*/

    public static int wartBezSum(List<Integer> list) {
        wartBez(list);
        return sumInt(list);
    }
}
