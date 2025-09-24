import java.util.*;
public class BinaryTreeLevelOrderTraversal {
    static class TreeNode { int val; TreeNode left,right; TreeNode(int v){val=v;} }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int sz = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i=0;i<sz;i++){
                TreeNode n = q.poll();
                level.add(n.val);
                if (n.left!=null) q.offer(n.left);
                if (n.right!=null) q.offer(n.right);
            }
            res.add(level);
        }
        return res;
    }
}
