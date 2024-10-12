package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> result = new HashMap<>();
        Set<String> uniqueSets = new HashSet<>(sourceMap.values());
        int minNumber = Integer.MAX_VALUE;
        for (String unique : uniqueSets) {
            for (Integer number : sourceMap.keySet()) {
                if (unique.equals(sourceMap.get(number))) {
                    if (number < minNumber) {
                        minNumber = number;
                    }
                }
            }
            result.put(unique, minNumber);
            minNumber = Integer.MAX_VALUE;
        }

        return result;
    }
}
