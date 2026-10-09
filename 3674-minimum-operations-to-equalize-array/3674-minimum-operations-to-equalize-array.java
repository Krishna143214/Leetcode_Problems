class Solution {
    public int minOperations(int[] nums) {
        for(int a:nums){
            if(a!=nums[0]){
                return 1;
            }
        }


        return 0;
        
    }
}