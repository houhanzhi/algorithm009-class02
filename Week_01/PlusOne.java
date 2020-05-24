package com.datastructure.algorithm.week01;

import java.util.Arrays;

/**
 * 加一
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 9, 9};
        int[] array3 = new int[]{9, 9, 9};
        int[] result1 = plusOne(array1);
        int[] result2 = plusOne(array2);
        int[] result3 = plusOne(array3);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // 大于9改变数组长度：[9,9]-->[1,0,0]
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }
}
