import java.util.PriorityQueue;
import java.util.HashSet;
class Solution {
    public long findScore(int[] nums) {
            HashSet<Integer> ll=new HashSet<>();
    PriorityQueue<pair> kk=new PriorityQueue<>(
        (a,b)->{
            if(a.val!=b.val){
                return a.val-b.val;
            }
            return a.ind-b.ind;
        }
    );

    for(int i=0;i<nums.length;i++){
        kk.add(new pair(nums[i],i));
    }



    long c=0;

    while(!kk.isEmpty()){
        pair g=kk.poll();

        if(!ll.contains(g.ind)){
        c=c+g.val;

    
       ll.add(g.ind);
       ll.add(g.ind+1);
       ll.add(g.ind-1);
        }
        


    }


    return c;
 

        
    }
}

class pair{
    int val;
    int ind;

   pair(int a,int b){
    val=a;
    ind=b;
   }
}