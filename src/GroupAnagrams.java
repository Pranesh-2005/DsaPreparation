import java.util.*;

public class GroupAnagrams {
    public static void main(String[] js){
        String[] in = {"eat","tea","tan","ate","nat","bat"};
        System.out.print(groupAnagrams(in));
    }
    public static List<List<String>> groupAnagrams(String[] in){
        Map<String,List<String>> op = new HashMap<>();
        for(String v:in){
            char[] ar = v.toCharArray();
            Arrays.sort(ar);
            String key = new String(ar);
            op.computeIfAbsent(key,k->new ArrayList<>()).add(v);
        }
        return new ArrayList<>(op.values());
    }
}
