package com.datastructure.algorithm.week03;

import java.util.*;

/**
 * 全排列
 */
public class Permute {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        List<List<Integer>> permute = permute(a);
        System.out.println(permute);;
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList();

        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums)
            output.add(num);
        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public static void backtrack(int n,
                          List<Integer> output,
                          List<List<Integer>> res,
                          int first) {
        // 所有数都填完了
        if (first == n)
            res.add(new ArrayList<Integer>(output));
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }

}
