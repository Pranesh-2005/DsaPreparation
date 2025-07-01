import java.util.Set;
import java.util.HashSet;
public class LongestSubStringWothoutRP {
    public static void main(String[] args) {
            String in = "helol";
        System.out.println(longestSub(in));
    }
    public static int longestSub(String a){
        Set<Character> st = new HashSet<>();
        int l = 0;
        int max = 0;
        for(int i=0;i<a.length();i++){
            while(st.contains(a.charAt(i))) st.remove(a.charAt(l++));
            st.add(a.charAt(i));
            max = Math.max(max, i-l+1);
        }
        return max;
    }
}
