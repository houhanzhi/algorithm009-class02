package com.datastructure.algorithm.week01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 11, 15};
        int[] result1 = twoSum1(array, 9);
        System.out.println(Arrays.toString(result1));
        int[] result2 = twoSum2(array, 9);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int s = target - nums[i];
            if (map.containsKey(s)) {
                return new int[]{map.get(s), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
