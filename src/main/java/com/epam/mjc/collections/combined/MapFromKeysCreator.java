package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry: sourceMap.entrySet()) {
            Set<String> set = result.computeIfAbsent(entry.getKey().length(), item -> new HashSet<>());
            set.add(entry.getKey());
        }
        return result;
    }
}
