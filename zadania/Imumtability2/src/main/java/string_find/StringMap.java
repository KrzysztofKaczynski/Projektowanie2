package string_find;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringMap {

    private String string;

    public StringMap(String string) {
        this.string = string;
    }


    public Map<String, Integer> countOccurrences(String s) {
        Map<String, Integer> occurrences = new HashMap<>();

        String[] words = s.split(" ");

        for (int i = 0; i < occurrences.size(); i++) {
            String word = words[i];

            if (occurrences.containsKey(word)) {
                occurrences.put(word, 1);
            } else {
                occurrences.put(word, occurrences.get(word) + 1);
            }


        }

        return occurrences;
    }
}












