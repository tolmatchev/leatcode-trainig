package org.example.strings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramTest {

    @Test
    public void test1() {
        GroupAnagram groupAnagram = new GroupAnagram();
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> act = groupAnagram.groupAnagrams(words);
        List<List<String>> exp = List.of(
                List.of("tan", "nat"),
                List.of("bat"),
                List.of("eat", "tea", "ate")
        );
        assertEquals(exp, act);
    }

    @Test
    public void test2() {
        GroupAnagram groupAnagram = new GroupAnagram();
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> act = groupAnagram.groupAnagrams1(words);
        List<List<String>> exp = List.of(
                List.of("tan", "nat"),
                List.of("bat"),
                List.of("eat", "tea", "ate")
        );
        assertEquals(exp, act);
    }

    @Test
    public void test3() {
        GroupAnagram groupAnagram = new GroupAnagram();
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> act = groupAnagram.groupAnagrams2(words);
        List<List<String>> exp = List.of(
                List.of("tan", "nat"),
                List.of("bat"),
                List.of("eat", "tea", "ate")
        );
        assertEquals(exp, act);
    }

}