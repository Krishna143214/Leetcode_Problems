class Solution {
    public int smallestEqual(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int r=i%10;
            if(r==nums[i]){
                return i;
            }
        }


        return -1;
        
    }
}