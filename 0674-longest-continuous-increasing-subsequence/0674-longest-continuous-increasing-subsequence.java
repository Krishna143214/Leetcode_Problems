class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int c=0;


        for(int i=0;i<nums.length;i++){
int ck=Integer.MIN_VALUE;
int cm=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]>ck){
                    ck=nums[j];
                    cm++;
                }
                else{
                    break;
                }

            }

            c=Math.max(cm,c);
        }


        return c;
        
    }
}