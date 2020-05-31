package com.datastructure.algorithm.week02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * N叉树的前序遍历
 */
public class PreOrder {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null)
            return list;

        int size = root.children.size();
        list.add(root.val);
        if (size > 0) {
            for (Node node : root.children) {
                preorder(node);
            }
        }

        return list;
    }


    /**
     * 栈顶的节点就是我们当前遍历到的节点
     *  O(n)
     * @param root
     * @return
     */
    public List<Integer> preorder1(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null)
            return output;
        // 先把根节点入栈，因为根节点是前序遍历中的第一个节点
        stack.add(root);
        while (!stack.isEmpty()) {
            // 从栈顶取出一个节点，它是我们当前遍历到的节点
            Node node = stack.pollLast();
            output.add(node.val);

            // 并把该节点的所有子节点逆序推入栈中
            Collections.reverse(node.children);
            for (Node n : node.children) {
                stack.add(n);
            }
        }


        return output;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
