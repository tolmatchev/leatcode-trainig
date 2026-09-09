package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void test1() {
        TwoSum twoSum = new TwoSum();
        int[] inputArray = {2,7,11,15};
        int[] expected = {0, 1};
        int[] result = twoSum.twoSum(inputArray, 9);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        TwoSum twoSum = new TwoSum();
        int[] inputArray = {3, 3};
        int[] expected = {0, 1};
        int[] result = twoSum.twoSum(inputArray, 6);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        TwoSum twoSum = new TwoSum();
        int[] inputArray = {2,7,11,15};
        int[] expected = {0, 1};
        int[] result = twoSum.twoSum2(inputArray, 9);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test4() {
        TwoSum twoSum = new TwoSum();
        int[] inputArray = {3, 3};
        int[] expected = {0, 1};
        int[] result = twoSum.twoSum2(inputArray, 6);
        assertArrayEquals(expected, result);
    }

}