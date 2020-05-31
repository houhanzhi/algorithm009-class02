package com.datastructure.algorithm.week02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的中序遍历:左---根---右
 */
public class InOrderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode1 root) {
        if (root != null) {
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }

    public List<Integer> inorderTraversal1(TreeNode1 root) {
        LinkedList<TreeNode1> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                root = root.left;
                stack.push(root);
            } else {
                TreeNode1 node = stack.poll();
                list.add(node.val);
                root = node.right;
            }
        }
        return list;
    }


}

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int x) {
        val = x;
    }
}




