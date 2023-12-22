package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry: projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                result.add(entry.getKey());
            }
        }

        result.sort((String o1, String o2) -> {
            int compareResult = Integer.compare(o2.length(), o1.length());
            if (compareResult == 0) {
                compareResult = o2.compareTo(o1);
            }
            return compareResult;
        });

        return result;
    }
}
