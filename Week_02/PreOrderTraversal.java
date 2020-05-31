package com.datastructure.algorithm.week02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的前序遍历:根---左---右
 */
public class PreOrderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return list;

        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }


    public List<Integer> preorderTraversal1(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                // 根
                list.add(root.val);
                stack.push(root);
                // 左
                root = root.left;
            } else {
                TreeNode pop = stack.pop();
                // 右
                root =  pop.right;
            }
        }
        return list;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
