package org.example.array;

import org.example.interview.SberRemoveDublicates;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SberRemoveDublicatesTest {

    @Test
    public void test1() {
        SberRemoveDublicates sber = new SberRemoveDublicates();
        List<Character> elements = new ArrayList<>(List.of('A', 'B', 'A', 'B', 'A', 'B', 'C', 'C', 'D', 'C', 'C'));
        List<Character> elementsRes = List.of('A', 'B', 'A', 'B', 'C', 'C', 'D');
        assertEquals(elementsRes, sber.removeDuplicates(elements));
    }

}