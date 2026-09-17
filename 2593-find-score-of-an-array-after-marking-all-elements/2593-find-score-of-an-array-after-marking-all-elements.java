import java.util.PriorityQueue;
import java.util.HashSet;
class Solution {
    public long findScore(int[] nums) {

        HashSet<Integer> kk=new HashSet<>();

        PriorityQueue<pair> ll=new PriorityQueue<>(

            (a,b)->{
                if(a.val != b.val){
                    return a.val-b.val;
                }

                return a.ind-b.ind; 
            }
        );

        for(int i=0;i<nums.length;i++){
            ll.add(new pair(nums[i],i));
        }



        long c=0;

        while(!ll.isEmpty()){
            pair g=ll.poll();

            if(!kk.contains(g.ind)){
                c=c+g.val;

                kk.add(g.ind);
                kk.add(g.ind+1);
                   kk.add(g.ind-1);
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