package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> result = new HashMap<>();
        List<String> splitWords = List.of(sentence.toLowerCase().split("[ ,;.=]"));

        Set<String> uniqueWords = new HashSet<>(splitWords);
        int counter = 0;

        for (String unique : uniqueWords) {
            for (String splitWord : splitWords) {
                if (unique.equals(splitWord)) {
                    counter++;
                }
            }
            result.put(unique, counter);
            counter = 0;
        }

        return result;
    }
}
