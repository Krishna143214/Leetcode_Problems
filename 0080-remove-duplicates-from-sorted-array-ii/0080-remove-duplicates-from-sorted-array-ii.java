import java.util.PriorityQueue;
import java.util.HashMap;


class Solution {
    public int removeDuplicates(int[] nums) {

        HashMap<Integer,Integer> kk=new HashMap<>();

 for(int i=0;i<nums.length;i++){
    if(kk.containsKey(nums[i])){
        kk.put(nums[i],kk.get(nums[i])+1);

    }
    else{
        kk.put(nums[i],1);
    }
 }




 PriorityQueue<pair> k=new PriorityQueue<>(
    (a,b)->{
        if(a.val!=b.val){
            return a.val-b.val;
        }
        return a.freq-b.freq;
    }
 );


 for(Map.Entry<Integer,Integer> nn:kk.entrySet()){
    k.add(new pair(nn.getKey(),nn.getValue()));

 }


 int c=0;


 while(!k.isEmpty()){
    pair m=k.poll();

    if(m.freq>1){
        nums[c]=m.val;
        c++;
        nums[c]=m.val;
        c++;
    }
    else{
        nums[c]=m.val;
        c++;
    }
 }


 return c;




        
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
