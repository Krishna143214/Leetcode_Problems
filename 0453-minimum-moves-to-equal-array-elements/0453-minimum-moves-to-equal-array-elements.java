
class Solution {
    public int minMoves(int[] nums) {
       


        int min=Integer.MAX_VALUE;
        int s=0;


        for(int a:nums){
            s=s+a;
         
            min=Math.min(min,a);

        }

        return s-nums.length*min;
        
        
    }
}