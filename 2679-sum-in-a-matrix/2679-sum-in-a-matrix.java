import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public int matrixSum(int[][] nums) {

        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }

        int res=0;

        for(int i=0;i<nums[0].length;i++){
            PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());
       

         for(int j=0;j<nums.length;j++){
            kk.add(nums[j][i]);

         }

         res=res+kk.peek();
        }


        return res;


        
    }
}