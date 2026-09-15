class Solution {
    public int minimumDeletions(int[] nums) {

        if(nums.length<=1){
            return 1;
        }

        int min=Integer.MAX_VALUE;

        int max=Integer.MIN_VALUE;



        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
             max=Math.max(max,nums[i]);
        }


        int l=0;
        int c=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==min||nums[i]==max){
                l++;

            }

            if(l==2){
                c=i+1;
                break;
            }
        }




          int ll=0;
        int c2=0;

        for(int i=nums.length-1;i>=0;i--){

            if(nums[i]==min||nums[i]==max){
                ll++;

            }

            if(ll==2){
                c2=nums.length-i;
                break;
            }
        }



        

        int fir=0;
        int last=-1;


        for(int i=0;i<nums.length;i++){
            fir++;
  if(nums[i]==min||nums[i]==max){
                break;

            }}

             for(int i=nums.length-1;i>=0;i--){
            fir++;
  if(nums[i]==min||nums[i]==max){
                break;

            }


        }


        int ans=Math.min(c,c2);

        return Math.min(ans,fir);


    }
}