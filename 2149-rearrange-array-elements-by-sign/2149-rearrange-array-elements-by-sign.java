class Solution {
    public int[] rearrangeArray(int[] nums) {
        int k[]=new int[nums.length/2];
         int l[]=new int[nums.length/2];
         int o=0;
         int p=0;


         for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                k[o]=nums[i];
                o++;
            }
             if(nums[i]<0){
                l[p]=nums[i];
                p++;
            }
         }


int g=0;

         for(int i=0;i<nums.length/2;i++){
            nums[g]=k[i];
            g++;
            nums[g]=l[i];
            g++;
         }


         return nums;
  


        
    }
}