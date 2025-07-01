import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] a = {1,2,1,2,5};
        int k = 2;
        System.out.print(Arrays.toString(topKFrequent(a,k)));
    }
    public static int[] topKFrequent(int[] a,int k){
        int[] res = new int[k];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n:a) mp.put(n,mp.getOrDefault(n,0)+1);
        Queue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(mp::get));
        for(int n:mp.keySet()){
            pq.add(n);
            if(pq.size() > k) pq.poll();
        }
        for(int i=0;i<k;i++) res[i] = pq.poll();
        return res;
    }
}
