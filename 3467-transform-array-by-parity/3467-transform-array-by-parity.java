class Solution {
    public int[] transformArray(int[] nums) {

        int ce=0;
        int co=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ce++;
            }
            else{
                co++;
            }
        }

        int j=0;
        int k=0;

        while(k<ce){
            nums[j]=0;
            j++;
            k++;
        }
        

          int l=0;

        while(l<co){
            nums[j]=1;
            j++;
            l++;
        }

        return nums;
    }
}