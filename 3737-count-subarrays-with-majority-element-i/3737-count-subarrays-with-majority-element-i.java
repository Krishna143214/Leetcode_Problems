
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int c=0;

        for(int i=0;i<nums.length;i++){
           int k=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                   k++;
                }
int len=(j-i)+1;

                if(k>(len/2)){
                    c++;
                }
             

            }
        }

        return c;

      

        
    }
}