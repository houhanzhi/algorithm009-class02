package com.datastructure.algorithm.week03;

/**
 * 二叉搜索树的最近公共祖先
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 如果root为null， 或者p=root， 或者q=root---->最近公共祖先为root
        if(root == null || p == root || q == root)
            return root;
        // 如果p和q都为null，说明root整颗树上没有发现p和q，返回null
        if(p == null || q == null)
            return null;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 如果p和q都不为null，说明在左子树上有q或p，右子树也有q或p，在q和p向上的过程中会在root相遇，返回root
        if(left != null && right != null)
            return root;
        // 如果q和p有个一为null，另一个不为null，不为null的记为node，此时node有两种情况
        // 1、要么node是q或p的其中一个
        // 2、要么node是q和p的最近公共祖先
        // 不管是那种情况直接放回node即可(不为null的节点)
        return left != null ? left : right;
    }
}

