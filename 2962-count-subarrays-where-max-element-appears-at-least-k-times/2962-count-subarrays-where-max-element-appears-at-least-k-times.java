class Solution {
    public long countSubarrays(int[] nums, int k) {

     int max=Integer.MIN_VALUE;

     for(int l=0;l<nums.length;l++){
        if(nums[l]>max){
            max=nums[l];
        }
     }


        int i=0;
        int j=0;
        int c=0;
        long res=0;

        while(j<nums.length){
            if(nums[j]==max){
               c++;
            }

           
            while(c>=k){
                if(nums[i]==max){
                    c--;
                }
                i++;
            }
             res=res+i;  

j++;
        }


        return res;
        
    }
}