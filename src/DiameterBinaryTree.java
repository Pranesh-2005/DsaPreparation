public class DiameterBinaryTree {
    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    private int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }
    private int dfs(TreeNode node) {
        if (node==null) return 0;
        int L = dfs(node.left), R = dfs(node.right);
        ans = Math.max(ans, L+R);
        return 1 + Math.max(L,R);
    }
}
