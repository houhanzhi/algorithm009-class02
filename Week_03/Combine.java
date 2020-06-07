package com.datastructure.algorithm.week03;

import java.util.LinkedList;
import java.util.List;

/**
 * 组合：回溯
 */
public class Combine {
    private Integer n;
    private Integer k;
    List<List<Integer>> output = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtrack(1, new LinkedList<Integer>());
        return output;
    }

    public void backtrack(int first, LinkedList<Integer> cur) {
        if(cur.size() == k)
            // 将每种结果添加到列表中[1,2]/[1,3]/[1,4]
            output.add(new LinkedList<Integer>(cur));
        for(int i = first; i <= n; i++) {
            cur.add(i);
            // i+1:保证数据的不可重复性
            backtrack(i + 1, cur);
            // 移除链表的最后一位:获取每个数的所有结果后，移除该数
            cur.removeLast();
        }
    }
}
