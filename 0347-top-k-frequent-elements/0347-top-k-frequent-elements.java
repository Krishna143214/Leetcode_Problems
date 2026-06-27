import java.util.HashMap;
import java.util.PriorityQueue;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

HashMap<Integer,Integer> kk=new HashMap<>();

for(int i=0;i<nums.length;i++){
    if(kk.containsKey(nums[i])){
        kk.put(nums[i],kk.get(nums[i])+1);
    }
    else{
        kk.put(nums[i],1);
    }
}

PriorityQueue<pair> ll=new PriorityQueue<>(
    (a,b)->{
        if(a.freq!=b.freq){
            return b.freq-a.freq;
        }
        return a.val-b.val;
    }
);

for(Map.Entry<Integer,Integer> nn:kk.entrySet()){
    ll.add(new pair(nn.getKey(),nn.getValue()));
}


int []p=new int[k];

for(int i=0;i<k;i++){
    pair t=ll.poll();
    p[i]=t.val;
}
return p;











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


