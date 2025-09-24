import java.util.*;
public class BuildTreePreIn {
    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    private int preIndex = 0;
    private Map<Integer,Integer> idxMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idxMap = new HashMap<>();
        for (int i=0;i<inorder.length;i++) idxMap.put(inorder[i], i);
        return helper(preorder, 0, inorder.length-1);
    }
    private TreeNode helper(int[] pre, int l, int r) {
        if (l>r) return null;
        int rootVal = pre[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int idx = idxMap.get(rootVal);
        root.left = helper(pre, l, idx-1);
        root.right = helper(pre, idx+1, r);
        return root;
    }
}
