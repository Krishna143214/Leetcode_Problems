class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
HashSet<Integer> kk=new HashSet<>();

int a=nums[nums.length/2];
int c=0;

for(int m:nums){
    if(m==a){
        c++;
    }
}


if(c==1){
    return true;
}

return false;
     
    }
}