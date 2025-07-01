public class LongestRepeatingReplacement {
    public static void main(String[] args) {
        String s = "AABAB";
        int k = 2;
        System.out.print(longestRep(s,k));
    }
    public static int longestRep(String s,int k){
        int[] a = new int[26];
        int l =0,mC = 0,mL = 0;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'A']++;
            mC = Math.max(mC,a[s.charAt(i)-'A']);
            while(i-l+1 - mC > k){
                a[s.charAt(l++)-'A']--;
            }
            mL = Math.max(mL,i-l+1);
        }
        return mL;
    }
}
