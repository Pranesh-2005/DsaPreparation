import java.util.Scanner;
public class PermutationInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String p = in.next();
        System.out.print(permutationInString(s,p));
    }
    public static boolean permutationInString(String s,String p){
        if(s.length() > p.length()) return false;
        int[] sa = new int[26], pa = new int[26];
        for(int i=0;i<s.length();i++){
            sa[s.charAt(i)-'a']++;
            pa[p.charAt(i)-'a']++;
        }
        int ma = 0;
        for(int i=0;i<26;i++) if(sa[i] == pa[i]) ma++;
        for(int i=0;i<p.length()-s.length();i++){
            if(ma == 26) return true;
            int r = p.charAt(i+s.length()) -'a';
            int l = p.charAt(i)-'a';
            pa[r]++;
            if(pa[r]==sa[r]) ma++;
            else if(pa[r]==sa[r]+1) ma--;
            pa[l]--;
            if(pa[l]==sa[l]) ma++;
            else if(pa[l]==sa[l]+1) ma--;
        }
        return ma == 26;
    }
}
