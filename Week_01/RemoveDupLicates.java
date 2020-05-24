package com.datastructure.algorithm.week01;

import java.util.HashMap;
import java.util.Map;

/**
 * 删除排序数组中的重复项
 */
public class RemoveDupLicates {
    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = removeDuplicates(array);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
