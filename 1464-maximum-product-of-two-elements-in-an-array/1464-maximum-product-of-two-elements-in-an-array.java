

class Solution {
    public int maxProduct(int[] nums) {

int lar=Integer.MIN_VALUE;
int ind=-1;
int slar=Integer.MIN_VALUE;

for(int i=0;i<nums.length;i++){
    if(nums[i]>lar){
        lar=nums[i];
        ind=i;
    }
}


for(int i=0;i<nums.length;i++){
    if(i==ind){
        continue;
    }
    else if(nums[i]>slar){
        slar=nums[i];
    }
}

return (lar-1)*(slar-1);

        
    }
}