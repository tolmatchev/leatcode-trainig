package org.example.interview;

//Удаление элементов из списка, начиная с 3 повторения
//
//    // Input: ['A', 'B', 'A', 'B', 'A', 'B', 'C', 'C', 'D', 'C', 'C']

/// / Output: [A, B, A, B, C, C, D]
//List<Character> removeDuplicates(List<Character> elements);

import java.util.HashMap;
import java.util.List;
public class SberRemoveDublicates {

    public List<Character> removeDuplicates(List<Character> elements) {
        HashMap<Character, Integer> mapCounter = new HashMap<>();
        for (int i = 0; i < elements.size(); i++) {
            if (!mapCounter.containsKey(elements.get(i))) {
                mapCounter.put(elements.get(i), 1);
            } else {
                Integer temp = mapCounter.get(elements.get(i));
                if (temp < 2) {
                    mapCounter.put(elements.get(i), temp + 1);
                }
                else {
                    elements.remove(i);
                    i--;
                }
            }
        }
        return elements;
    }
}
