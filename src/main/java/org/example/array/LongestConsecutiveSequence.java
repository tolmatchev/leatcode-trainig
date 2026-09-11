package org.example.array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    /*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

    You must write an algorithm that runs in O(n) time.

    Example 1:

    Input: nums = [100,4,200,1,3,2]
    Output: 4
    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
    Example 2:

    Input: nums = [0,3,7,2,5,8,4,6,0,1]
    Output: 9
    Example 3:

    Input: nums = [1,0,1,2]
    Output: 3


    Constraints:

    0 <= nums.length <= 105
    -109 <= nums[i] <= 109
    * */
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int result = 1;
        int maxResult = 1;
        int temp = 0;
        int i = 0;
        for (Integer value : set) {
            if (i == 0) {
                i++;
                temp = value;
                continue;
            }
            if(value == temp + 1)
            {
                result++;
            } else {
                if (result > maxResult) {
                    maxResult = result;
                }
                result = 1;
            }
            i++;
            temp = value;
        }

        return Math.max(result, maxResult);
    }

    public int longestConsecutive1(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}
