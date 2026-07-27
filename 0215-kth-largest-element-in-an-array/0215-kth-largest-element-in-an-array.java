import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int findKthLargest(int[] nums, int k) {
  PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());

  for(int i=0;i<nums.length;i++){
    kk.add(nums[i]);
  }

for(int i=0;i<k-1;i++){
    kk.poll();
}

return kk.peek();








 

        
    }
}