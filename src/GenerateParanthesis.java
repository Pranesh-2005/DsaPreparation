import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParanthesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(generateParanthesis(n));
    }
    public static ArrayList<String > generateParanthesis(int n){
        ArrayList<String> res = new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }
    public static void backtrack(ArrayList<String> res,String cu,int o,int c,int n){
        if(cu.length() == n*2){
            res.add(cu);
            return;
        }
        if(o<n) backtrack(res,cu+"(",o+1,c,n);
        if(c<o) backtrack(res,cu+")",o,c+1,n);
    }
}
