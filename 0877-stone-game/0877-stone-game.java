
class Solution {
    public boolean stoneGame(int[] nums) {

        int i=0;
        int j=nums.length-1;
        int a=0;
        int b=0;

        while(i<j){
            if(nums[i]>nums[j]){
                a=a+nums[i];
                b=b+nums[j];
            }
            else{
                a=a+nums[j];
                b=b+nums[i];

            }
            i++;
            j--;        }

            if(a>b){
                return true;
            }
            return false;

        
    }
}