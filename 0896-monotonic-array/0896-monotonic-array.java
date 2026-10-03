class Solution {
    public boolean isMonotonic(int[] nums) {

        int in=0;
        int dec=0;
        int eq=0;


        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                in++;
            }
            else if(nums[i]<nums[i+1]){
                dec++;
            }

            else{
                eq++;
            }
        }




        if(in!=0&&dec!=0){
            return false;
        }

  

        return true;
        
    }
}