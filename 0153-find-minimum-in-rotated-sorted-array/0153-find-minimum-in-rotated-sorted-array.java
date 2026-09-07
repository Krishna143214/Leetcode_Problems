class Solution {
    public int findMin(int[] nums) {
       int i=0;
int j=nums.length-1;
int k=-1;

while(i<=j){
    int mid=(i+j)/2;

    if(nums[mid]>nums[nums.length-1]){
        i=mid+1;
    }
    else{
        k=mid;
        j=mid-1;

    }
}


return nums[k];

        


 


}}