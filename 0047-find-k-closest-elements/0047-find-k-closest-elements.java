import java.util.PriorityQueue;
import java.util.Collections;
import java.util.ArrayList;


class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {


        PriorityQueue<pair> kk=new PriorityQueue<>(


            (a,b)->{
                if(a.diff!=b.diff){
                    return a.diff-b.diff;
                }

                return a.val-b.val;
            }
        );



        for(int i=0;i<nums.length;i++){

            int dif=Math.abs(nums[i]-x);

            kk.add(new pair(nums[i],dif));
        }


        ArrayList<Integer> ll=new ArrayList<>();


        for(int i=0;i<k;i++){
            pair n=kk.poll();

            ll.add(n.val);
        }
Collections.sort(ll);

return ll;



      



}

}

class pair{
    int val;
    int diff;

    pair(int a,int b){
        val=a;
        diff=b;
    }
}
