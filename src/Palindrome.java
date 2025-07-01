public class Palindrome {
    public static void main(String[] args) {
        String in = "JSSJ";
        System.out.print(isPal(in));
    }
    public static boolean isPal(String s){
        int st = 0, e = s.length()-1;
        while (st<e&& s.charAt(st++) != s.charAt(e--)) return false;


    }
}
