package com.datastructure.algorithm.week01;

import java.util.Arrays;

/**
 * 旋转数组
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(array, 3);
        rotate1(array, 3);
        rotate2(array, 3);
        rotate3(array, 3);
    }

    // 暴力O(n)+O(1)
    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            // 存放数组尾部数值
            int pre = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                int temp = nums[j];
                nums[j] = pre;
                pre = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    // 使用额外的数组
    public static void rotate1(int[] nums, int k) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // 获取移动后的位置
            array[(i + k) % nums.length] = nums[i];
        }

        // 将array复制到nums中
        for (int i = 0; i < array.length; i++) {
            nums[i] = array[i];
        }

        System.out.println(Arrays.toString(nums));
    }

    // 使用环状替换
    public static void rotate2(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            // 存放数组尾部数值
            int pre = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                int temp = nums[j];
                nums[j] = pre;
                pre = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    // 使用环状替换
    public static void rotate3(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            // 存放数组尾部数值
            int pre = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                int temp = nums[j];
                nums[j] = pre;
                pre = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
