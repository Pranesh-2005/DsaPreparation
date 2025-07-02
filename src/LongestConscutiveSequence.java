import java.util.Set;
import java.util.HashSet;
public class LongestConscutiveSequence {
    public static void main(String[] args) {
        int[] a = {1,2,10,4};
        System.out.print(longestConsecutiveSequence(a));
    }
    public static int longestConsecutiveSequence(int[] a){
        Set<Integer> st = new HashSet<>();
        for(int nu:a) st.add(nu);
        int lon = 0;
        for(int nu:st){
            if(!st.contains(nu-1)){
                int len = 1;
                while(st.contains(nu+len)) len++;
                lon = Math.max(lon,len);
            }
        }
        return lon;
    }
}
