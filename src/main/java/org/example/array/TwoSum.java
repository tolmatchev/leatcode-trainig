package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     *
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     *
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     *
     *
     * Constraints:
     *
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * Only one valid answer exists.
     *
     *
     * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapNums = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (mapNums.containsKey(nums[i])) {
                if (nums[i] * 2 == target) {
                    result[0] = mapNums.get(nums[i]);
                    result[1] = i;
                    return result;
                }
            }
            mapNums.put(nums[i], i);
        }
        for (Integer integer : mapNums.keySet()) {
            if (mapNums.containsKey(target - integer)) {
                result[0] = mapNums.get(target - integer);
                result[1] = mapNums.get(integer);
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> mapNums = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (mapNums.containsKey(complement)) {
                result[0] = mapNums.get(complement);
                result[1] = i;
                return result;
            }
            mapNums.put(nums[i], i);
        }

        return result;
    }
}
