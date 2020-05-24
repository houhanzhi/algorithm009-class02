package com.datastructure.algorithm.week01;

import java.util.Arrays;

/**
 * 移动零
 */
public class moveZeroes {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 3, 12};
        moveZeroes1(array);
        moveZeroes2(array);
    }

    public static void moveZeroes1(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes2(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        // 统计非0元素
        int j = 0;
        for(int i=0;i<nums.length;++i) {
            if(nums[i]!=0) {
                nums[j++] = nums[i];
            }
        }

        //第二次遍历把末尾的元素都赋为0即可
        for(int i=j;i<nums.length;++i) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
