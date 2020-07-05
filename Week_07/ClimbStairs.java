package com.datastructure.algorithm.week07;

/**
 * 爬楼梯
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        // if(n < 3)
        //     return n;
        // int[] a = new int[n+1];
        // a[1] = 1;
        // a[2] = 2;
        // for(int i = 3; i <= n; i++) {
        //     a[i] = a[i - 1] + a[i - 2];
        // }
        // return a[n];
        if(n < 3)
            return n;
        int f1 = 1, f2 = 2, f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
