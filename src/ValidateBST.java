public class ValidateBST {
    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    private boolean helper(TreeNode node, Long low, Long high) {
        if (node==null) return true;
        if (low!=null && node.val <= low) return false;
        if (high!=null && node.val >= high) return false;
        return helper(node.left, low, (long)node.val) && helper(node.right, (long)node.val, high);
    }
}
