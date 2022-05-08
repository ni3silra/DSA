package com.problemsolving.tree;


public class MaximumWidthOfTree {

    static class Info {
        int maxWidth;
        Info(int maxWidth) {
            this.maxWidth = maxWidth;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        return Util(root).maxWidth;
    }

    int maxWidth = Integer.MIN_VALUE;

    private Info Util(TreeNode root) {
        if (root == null) return new Info(0);
        if (root.left != null) maxWidth = Math.max(Util(root.left).maxWidth +1,maxWidth);
        if (root.right != null) maxWidth = Math.max(Util(root.right).maxWidth+1,maxWidth);
        return new Info(maxWidth);
    }

//    public int widthOfBinaryTree(TreeNode root) {
//        List<int[]> res = new ArrayList<>();
//        res.add(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE});
//        return dfs(root, 0, 0, res);
//    }
//
//    private int dfs(TreeNode root, int level, int ind, List<int[]> res) {
//        if (root == null) return 0;
////        if (level == res.size()) res.add(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE});
//        int[] curr = res.get(level);
//        curr[0] = Math.min(curr[0], ind);
//        curr[1] = Math.max(curr[1], ind);
//        int max = curr[1] - curr[0] + 1;
//        if (root.left != null) max = Math.max(dfs(root.left, level + 1, ind * 2, res), max);
//        if (root.right != null) max = Math.max(dfs(root.right, level + 1, ind * 2 + 1, res), max);
//        return max;
//    }
}
