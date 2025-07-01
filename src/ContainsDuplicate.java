import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDup(int[] a){
        Set<Integer> s = new HashSet<>();
        for(int n:a) if(!s.add(n)) return true;
        return false;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,1,2};
        System.out.println(containsDup(a));
    }
}
