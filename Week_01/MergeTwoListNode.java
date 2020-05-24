package com.datastructure.algorithm.week01;

/**
 * @author 来自猩猩的攻城狮hhz
 * @date 2020-05-22 18:11
 */
public class MergeTwoListNode {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(4);
        l2.next.next.next.next = new ListNode(2);

//        ListNode resultNode = mergeTwoLists(l1, l2);
        ListNode resultNode = mergeTwoLists1(l1, l2);
        while (resultNode != null) {
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        }

    }

    // 暴力
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pHead = new ListNode(-1);
        ListNode p = pHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        p.next = l1 == null ? l2 : l1;
        return pHead.next;
    }

    // 递归
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;
        else if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;

        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
