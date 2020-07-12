package com.datastructure.algorithm.week08;

/**
 * @author 来自猩猩的攻城狮hhz
 * @date 2020-07-12 21:06
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + (n & 1);
            // 无符号移位
            n >>>= 1;
        }
        return result;
    }
}
