package com.datastructure.algorithm.week02;

import java.util.Arrays;

/**
 * 有效的字母异位词
 */
public class IsAnagramDemo {
    public static void main(String[] args) {

    }

    //    O(nlogn)
    public static boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String s1 = new String(c1);
        String s2 = new String(c2);
        if (s1.equals(s2))
            return true;
        return false;
    }

    //    O(n)
    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length())
            return false;
        // 字母一共26个
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
            a[t.charAt(i) - 'a']--;
        }

        for (int i : a) {
            if (i != 0)
                return false;
        }
        return true;
    }


}
