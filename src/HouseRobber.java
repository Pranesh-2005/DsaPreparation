public class HouseRobber {
    public int rob(int[] nums) {
        int prev = 0, curr = 0;
        for (int n: nums) {
            int tmp = Math.max(curr, prev + n);
            prev = curr;
            curr = tmp;
        }
        return curr;
    }
}
