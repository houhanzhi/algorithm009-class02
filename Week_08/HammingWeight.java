package com.datastructure.algorithm.week08;

/**
 * @author 来自猩猩的攻城狮hhz
 * @date 2020-07-12 21:05
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        // int sum = 0;
        // while (n != 0) {
        //     sum++;
        //     n &= (n - 1);
        // }
        // return sum;
        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1);
            // 无符号右移
            n = n>>>1;
        }
        return ones;
    }
}
