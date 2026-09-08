import java.util.ArrayList;

class Solution {
    public void sortColors(int[] nums) {
        int o=0;
        int on=0;
        int t=0;
for(int i=0;i<nums.length;i++){
    if(nums[i]==0){
        o++;
    }
    else if(nums[i]==1){
        on++;
    }
    else{
        t++;
    }
}

int k=0;

int l=0;
while(k<o){
    nums[l]=0;
    l++;
    k++;
}
 int n=0;
while(n<on){
    nums[l]=1;
    l++;
    n++;
}

 int nn=0;
while(nn<t){
    nums[l]=2;
    l++;
    nn++;
}



}}