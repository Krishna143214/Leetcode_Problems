import java.util.PriorityQueue;
import java.util.HashMap;
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> ll=new HashMap<>();


        for(int i:nums){
            if(ll.containsKey(i)){
                ll.put(i,ll.get(i)+1);
            }
            else{
                ll.put(i,1);
            }
        }


        PriorityQueue<pair> kk=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq){
                    return a.freq-b.freq;
                }

                return b.val-a.val;
            }
        );


        for(int a:nums){
            kk.add(new pair(a,ll.get(a)));
        }

        int o=0;


        while(!kk.isEmpty()){
            nums[o]=kk.poll().val;
            o++;

        }
return nums;
        
        
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