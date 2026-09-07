class Solution {
    public int maxSubArray(int[] nums) {

int best=nums[0];
int res=nums[0];

for(int i=1;i<nums.length;i++){
    if(nums[i]+best>nums[i]){
        best=nums[i]+best;
        res=Math.max(best,res);
    }
    else{
        best=nums[i];
        res=Math.max(best,res);
    }
}

  return res;    
        
    }
}