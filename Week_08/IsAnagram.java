package com.datastructure.algorithm.week08;

/**
 * @author 来自猩猩的攻城狮hhz
 * @date 2020-07-12 21:07
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        // 暴力：O(nlogN)
        // char[] c = s.toCharArray();
        // char[] c1 = t.toCharArray();
        // Arrays.sort(c);
        // Arrays.sort(c1);
        // String s11 = new String(c);
        // String s1 = new String(c1);
        // if(s1.equals(s11))
        //     return true;
        // return false;

        // 哈希表:统计每个字符的频次O(n)
        // Map<char, Integer> map = new Hash
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
