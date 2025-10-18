/**
 * LeetCode Problem: 1 - Two Sum
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Description:
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * You can return the answer in any order.
 *
 * Approach:
 * Use a HashMap to store numbers we've seen along with their indices.
 * For each number, calculate the complement (target - current number).
 * If the complement exists in the map, we found our pair.
 * Otherwise, add the current number and its index to the map.
 *
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(n) - HashMap stores up to n elements
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    // Test cases
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic case
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        int[] expected1 = {0, 1};
        assert Arrays.equals(result1, expected1) :
            "Test 1 Failed: Expected " + Arrays.toString(expected1) +
            ", got " + Arrays.toString(result1);
        System.out.println("Test 1 Passed: " + Arrays.toString(result1));

        // Test case 2: Numbers in different positions
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        int[] expected2 = {1, 2};
        assert Arrays.equals(result2, expected2) :
            "Test 2 Failed: Expected " + Arrays.toString(expected2) +
            ", got " + Arrays.toString(result2);
        System.out.println("Test 2 Passed: " + Arrays.toString(result2));

        // Test case 3: Same number used twice (different indices)
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        int[] expected3 = {0, 1};
        assert Arrays.equals(result3, expected3) :
            "Test 3 Failed: Expected " + Arrays.toString(expected3) +
            ", got " + Arrays.toString(result3);
        System.out.println("Test 3 Passed: " + Arrays.toString(result3));

        // Test case 4: Negative numbers
        int[] nums4 = {-1, -2, -3, -4, -5};
        int target4 = -8;
        int[] result4 = solution.twoSum(nums4, target4);
        int[] expected4 = {2, 4};
        assert Arrays.equals(result4, expected4) :
            "Test 4 Failed: Expected " + Arrays.toString(expected4) +
            ", got " + Arrays.toString(result4);
        System.out.println("Test 4 Passed: " + Arrays.toString(result4));

        // Test case 5: Mix of positive and negative
        int[] nums5 = {-3, 4, 3, 90};
        int target5 = 0;
        int[] result5 = solution.twoSum(nums5, target5);
        int[] expected5 = {0, 2};
        assert Arrays.equals(result5, expected5) :
            "Test 5 Failed: Expected " + Arrays.toString(expected5) +
            ", got " + Arrays.toString(result5);
        System.out.println("Test 5 Passed: " + Arrays.toString(result5));

        System.out.println("\nAll test cases passed!");
    }
}
