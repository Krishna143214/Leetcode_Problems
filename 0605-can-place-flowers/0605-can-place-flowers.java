class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {

        int c=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==0 &&
              (i==0 || nums[i-1]==0) &&
              (i==nums.length-1 || nums[i+1]==0)){

                nums[i]=1;
                c++;
            }
        }

        return c>=n;
    }
}