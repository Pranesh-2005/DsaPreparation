public class ReverseBits {
    public static void main(String[] args) {
        int a = 00000010100101000001111010011100;
        System.out.print(reverseBit(a));
    }
    public static int reverseBit(int a){
        int res = 0;
        for(int i=0;i<32;i++){
            res <<= 1;
            res |=(a&1);
            res >>>= 1;
        }
        return res;
    }
}
