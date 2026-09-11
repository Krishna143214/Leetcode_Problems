class Solution {
    public int subarraySum(int[] nums, int k) {
int c=0;

for(int i=0;i<nums.length;i++){
    int f=0;
    for(int j=i;j<nums.length;j++){
        f=f+nums[j];

        if(f==k){
            c++;
        }

    }
}

return c;

        
    }
}