import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "olleH";
        System.out.print(validAn(s1,s2));
    }
    public static boolean validAn(String s1,String s2){
        if(s1.length() != s2.length())return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
