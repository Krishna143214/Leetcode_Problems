class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int premax[]=new int[nums.length];

        premax[0]=nums[0];

        for(int i=1;i<nums.length;i++){

            if(nums[i]>premax[i-1]){
                premax[i]=nums[i];
            }
            else{
                premax[i]=premax[i-1];
            }
        }



        int sufmin[]=new int[nums.length];

        sufmin[nums.length-1]=nums[nums.length-1];

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<sufmin[i+1]){
                sufmin[i]=nums[i];
            }
            else{
                sufmin[i]=sufmin[i+1];
            }
        }

int min=Integer.MAX_VALUE;
int ind=-1;

        for(int i=0;i<nums.length;i++){
            int c=premax[i]-sufmin[i];

            if(c<=k){
                min=c;
                ind=i;
                break;
            }
        }


        return ind;
        
    }
}