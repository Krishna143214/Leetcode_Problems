class Solution {
    public int[] productExceptSelf(int[] nums) {
        int c=0;


      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            c++;
        }
      }
int r[]=new int[nums.length];
      if(c>=2){
        return r;
      }

      if(c==1){
        int g=1;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==0){
                continue;
            }
            g=g*nums[i];

        }

        int res[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=g;
            }
            else{
                res[i]=0;
            }
        }

        return res;


      }

   int g=1;
        for(int i=0;i<nums.length;i++){

        
            g=g*nums[i];

        }

int re[]=new int[nums.length];
       
        for(int i=0;i<nums.length;i++){
         re[i]=g/nums[i];
   

        }

        return re;



        
    }
}