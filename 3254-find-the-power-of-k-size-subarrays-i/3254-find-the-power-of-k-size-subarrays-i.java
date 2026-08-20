class Solution {
    public int[] resultsArray(int[] nums, int k) {

        if(k==1){
            return nums;
        }
        

        int res[]=new int[(nums.length-k)+1];
        

        for(int i=0;i<=nums.length-k;i++){
            int f=0;
            int max=0;
            for(int j=i;j<i+k;j++){
                
                if(j<(i+k)-1){
                    if(nums[j]+1!=nums[j+1]){
                        f=1;
                      
                    }
                      max=nums[j+1];

                }

            }


            if(f==0){

res[i]=max;
            }

            else{
                res[i]=-1;
            }
        }


        return res;


        
        
    }
}