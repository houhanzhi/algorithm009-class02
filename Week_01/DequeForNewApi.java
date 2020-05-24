package com.datastructure.algorithm.week01;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 用 add first 或 add last 这套新的 API 改写
 */
public class DequeForNewApi {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);
        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");
//        [c, b, a, A, B, C]
        System.out.println(deque);
        String peek = deque.peek();
        System.out.println(peek);
        System.out.println(deque);

        while(deque.size() > 0) {
            System.out.println(deque.pop());
        }
        System.out.println(deque);



    }
}
