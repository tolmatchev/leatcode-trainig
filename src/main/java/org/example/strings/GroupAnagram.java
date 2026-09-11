package org.example.strings;

import java.util.*;

public class GroupAnagram {


    public List<List<String>> groupAnagrams(String[] strs) {
        // ["eat","tea","tan","ate","nat","bat"]
        // e -> 1, a -> 1, t ->1 ; t -> 1, e -> 1, a -> 1; ...
        // list (map1, map2, ...)
        //
        Map<Map<Character, Integer>, List<Integer>> mapCounter = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> tempMap = new HashMap<>();
            List<Integer> indexes = new ArrayList<>();
            for (int j = 0; j < strs[i].length(); j++) {
                if (tempMap.containsKey(strs[i].charAt(j))) {
                    tempMap.put(strs[i].charAt(j), tempMap.get(strs[i].charAt(j)) + 1);
                } else {
                    tempMap.put(strs[i].charAt(j), 1);
                }
            }
            if (mapCounter.containsKey(tempMap)) {
                mapCounter.get(tempMap).add(i);
            } else {
                mapCounter.put(tempMap, new ArrayList<>(List.of(i)));
            }
        }

        List<List<String>> resultList = new ArrayList<>();
        mapCounter.forEach((key, value) -> {
            List<String> tempStr = new ArrayList<>();
            for(int i = 0; i < value.size(); i++) {
                tempStr.add(strs[value.get(i)]);
            }
            resultList.add(tempStr);
        });



        return resultList;
    }

    public List<List<String>> groupAnagrams1(String[] strs) {


        Map<Map<Character, Integer>, List<String>> mapCounter = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            Map<Character, Integer> tempMap = new HashMap<>();
            for (int j = 0; j < strs[i].length(); j++) {
                if (tempMap.containsKey(strs[i].charAt(j))) {
                    tempMap.put(strs[i].charAt(j), tempMap.get(strs[i].charAt(j)) + 1);
                } else {
                    tempMap.put(strs[i].charAt(j), 1);
                }
            }
            if (mapCounter.containsKey(tempMap)) {
                mapCounter.get(tempMap).add(strs[i]);
            } else {
                mapCounter.put(tempMap, new ArrayList<>(List.of(strs[i])));
            }
        }

        return mapCounter.values().stream().toList();

    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<Map<Character, Integer>, List<String>> mapCounter = new HashMap<>();
        for (String str : strs) {
            Map<Character, Integer> tempMap = new HashMap<>();
            for (char c : str.toCharArray()) {
                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }
            mapCounter
                    .computeIfAbsent(tempMap, k -> new ArrayList<>())
                    .add(str);
        }
        return mapCounter.values().stream().toList();
    }
}
