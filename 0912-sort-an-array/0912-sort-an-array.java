import java.util.PriorityQueue;
class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> ll=new PriorityQueue<>();

      for(int i=0;i<nums.length;i++){
         ll.add(nums[i]);
      }

      int h=0;
      while(!ll.isEmpty()){
        nums[h]=ll.poll();
        h++;
      }

      return nums;
        
    }
}