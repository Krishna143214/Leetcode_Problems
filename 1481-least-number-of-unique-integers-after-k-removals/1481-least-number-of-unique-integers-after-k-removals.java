import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer,Integer> kk=new HashMap<>();

        for(int a:arr){
            if(kk.containsKey(a)){
                kk.put(a,kk.get(a)+1);
            }
            else{
                kk.put(a,1);
            }
        }


        PriorityQueue<pair> ll=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq){
                    return a.freq-b.freq;
                }
                return a.val-b.val;
            }
        );



        for(Map.Entry<Integer,Integer> mm:kk.entrySet()){
            ll.add(new pair(mm.getKey(),mm.getValue()));
        }

   while(!ll.isEmpty()){

    if(ll.peek().freq>k){
        return ll.size();
    }
    else{
        k=k-ll.poll().freq;
    }
   }

   return ll.size();

        
        
    }
}
class pair{
    int val;
    int freq;

    pair(int a,int b){
        val=a;
        freq=b;
    }
}