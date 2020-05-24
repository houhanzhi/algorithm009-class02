package com.datastructure.algorithm.week01;

import java.util.Arrays;

/**
 * 合并两个有序数组
 */
public class MergeTwoArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] array2 = new int[]{2, 5, 6};
        merge(array1, 2, array2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        // 重整数组后的下表
        int len = m + n - 1;

        // 注意下标的位置
//        while (len1 > 0 && len2 > 0)
        while (len1 >= 0 && len2 >= 0)
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];

        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);

        System.out.println(Arrays.toString(nums1));

    }
}
