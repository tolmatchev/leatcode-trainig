package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    @Test
    public void test1() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {1, 0, 1, 2};
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {1, 2, 6, 7, 8};
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(3, result);
    }

    @Test
    public void test3() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(4, result);
    }

    @Test
    public void test4() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {9, 1, -3, 2, 4, 8, 3, -1, 6, -2, -4, 7};
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        assertEquals(4, result);
    }

    @Test
    public void test11() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {1, 0, 1, 2};
        int result = longestConsecutiveSequence.longestConsecutive1(nums);
        assertEquals(3, result);
    }

    @Test
    public void test22() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {1, 2, 6, 7, 8};
        int result = longestConsecutiveSequence.longestConsecutive1(nums);
        assertEquals(3, result);
    }

    @Test
    public void test33() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutiveSequence.longestConsecutive1(nums);
        assertEquals(4, result);
    }

    @Test
    public void test44() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {9, 1, -3, 2, 4, 8, 3, -1, 6, -2, -4, 7};
        int result = longestConsecutiveSequence.longestConsecutive1(nums);
        assertEquals(4, result);
    }
}