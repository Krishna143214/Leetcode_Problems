import java.util.HashMap;
import java.util.PriorityQueue;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

PriorityQueue<pair> kk=new PriorityQueue<>(
(a,b)->{
    if(a.freq!=b.freq){
        return b.freq-a.freq;
    }
    return a.val-b.val;
}


);

HashMap<Integer,Integer> ll=new HashMap<>();

for(int i=0;i<nums.length;i++){
    if(ll.containsKey(nums[i])){
        ll.put(nums[i],ll.get(nums[i])+1);
    }
    else{
        ll.put(nums[i],1);
    }
}


for(Map.Entry<Integer,Integer> ss:ll.entrySet()){

    kk.add(new pair(ss.getKey(),ss.getValue()));

}


int res[]=new int[k];

for(int i=0;i<k;i++){
    pair f=kk.poll();
    res[i]=f.val;

}


return res;


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




