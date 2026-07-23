class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int fir=Math.abs(nums[0]-nums[nums.length-1]);

        int maxdiff=Integer.MIN_VALUE;

        for(int i=0;i<nums.length-1;i++){
            int val=Math.abs(nums[i]-nums[i+1]);
            if(val>maxdiff){
                maxdiff=val;
            }



        }


        
            if(fir>maxdiff){
                return fir;
            }

            return maxdiff;
        
    }
}