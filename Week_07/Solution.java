package com.datastructure.algorithm.week07;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号的生成
 */
public class Solution {
    private List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        _generate(0, 0, n, "");
        return list;
    }

    public void _generate(int left, int right, int n, String s) {
        if(left == n && right == n) {
            list.add(s);
            return;
        }
        if(left < n)
            _generate(left + 1, right, n, s+"(");
        if(left > right)
            _generate(left, right + 1, n, s+")");
    }
}
