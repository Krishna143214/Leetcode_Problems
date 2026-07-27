import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public long maxKelements(int[] nums, int k) {

   PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());

   for(int i=0;i<nums.length;i++){
    kk.add(nums[i]);
   }
 long ans=0;
   for(int i=0;i<k;i++){
    int v=kk.poll();
    ans=ans+v;
    int r=v/3;

    if(v%3!=0){
        r++;
    }
    kk.add(r);

   }






return ans;


        
    }
}