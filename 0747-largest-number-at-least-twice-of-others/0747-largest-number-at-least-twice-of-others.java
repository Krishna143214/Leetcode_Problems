class Solution {
    public int dominantIndex(int[] nums) {

        int max=Integer.MIN_VALUE;
        int ind=-1;

        for(int a=0;a<nums.length;a++){
            if(nums[a]>max){
                max=nums[a];
                ind=a;
            }
           
        }

        for(int a:nums){
            if(a==max){
                continue;
            }
            else if(a*2>max){
                return -1;
            }
        }


        return ind;
        
    }
}