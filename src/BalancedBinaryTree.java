public class BalancedBinaryTree {
    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    private int height(TreeNode node) {
        if (node==null) return 0;
        int L = height(node.left);
        if (L == -1) return -1;
        int R = height(node.right);
        if (R == -1) return -1;
        if (Math.abs(L-R) > 1) return -1;
        return 1 + Math.max(L,R);
    }
}
