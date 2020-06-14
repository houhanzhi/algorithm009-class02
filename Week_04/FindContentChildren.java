package com.datastructure.algorithm.week04;

import java.util.Arrays;

/**
 * 分发饼干
 */
public class FindContentChildren {

    public int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gr = 0, sr = 0;
        while (gr < g.length && sr < s.length) {
            if (g[gr] <= s[sr]) gr++;
            sr++;
        }
        return gr;
    }
}
