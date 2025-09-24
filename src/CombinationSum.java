import java.util.*;
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] candidates, int idx, int remain, List<Integer> cur, List<List<Integer>> res) {
        if (remain == 0) { res.add(new ArrayList<>(cur)); return; }
        for (int i = idx; i < candidates.length; i++) {
            if (candidates[i] > remain) break;
            cur.add(candidates[i]);
            backtrack(candidates, i, remain - candidates[i], cur, res);
            cur.remove(cur.size()-1);
        }
    }
}
