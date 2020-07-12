package com.datastructure.algorithm.week08;

/**
 * @author 来自猩猩的攻城狮hhz
 * @date 2020-07-12 21:06
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }
}
