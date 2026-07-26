import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public long maxKelements(int[] nums, int k) {

        long res=0;
        PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){
            kk.add(nums[i]);
        }

        for(int i=0;i<k;i++){
            int val=kk.poll();
            res=res+val;

           if(val%3==0){
            kk.add(val/3);
           }
           else{
           kk.add((val/3)+1);
           }
        }

return res;







        
    }
}