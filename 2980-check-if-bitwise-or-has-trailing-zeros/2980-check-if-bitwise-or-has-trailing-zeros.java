class Solution {
    public boolean hasTrailingZeros(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int r=nums[i];
            for(int j=i+1;j<nums.length;j++){
              if((nums[i] | nums[j]) % 2 == 0){
                    return true;
                }


            }
        }


        return false;
        
    }
}