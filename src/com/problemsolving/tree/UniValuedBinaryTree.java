package com.problemsolving.tree;

import java.util.*;

public class UniValuedBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        System.out.println(isUniValTree(root));
    }

    static Set<Integer> set = new HashSet<>();

    public static boolean isUniValTree(TreeNode root) {
        if (root == null) return true;
        set.add(root.val);
        return set.size() != 2 && isUniValTree(root.left) && isUniValTree(root.right);
    }
}
