class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {



     long pro=1;

    int low=0;
    int h=0;
    int c=0;

 while(h<nums.length){
    if(k<=1){
        return 0;
    }

    pro=pro*nums[h];

  
        while(pro>=k){
            pro=pro/nums[low];
            low++;
        }

        c=c+h-low+1;


    
    h++;
 }

 return c;
        
    }
}