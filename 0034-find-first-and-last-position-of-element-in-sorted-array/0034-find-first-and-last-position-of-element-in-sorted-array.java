class Solution {
    public int[] searchRange(int[] nums, int target) {
    int l=0;
    int h=nums.length-1;
    int k=-1;

    while(l<=h){
        int mid=(l+h)/2;

        if(nums[mid]==target){
            k=mid;
            h=mid-1;
        }
         else if(nums[mid]>target){
          
            h=mid-1;
        }
        else{
            l=mid+1;
        }

    }

if(k==-1){
        return new int[]{-1,-1};
    }


    int l2=0;
    int h2=nums.length-1;
    int k2=-1;

    while(l2<=h2){
        int mid=(l2+h2)/2;

        if(nums[mid]==target){
            k2=mid;
            l2=mid+1;
        }
         else if(nums[mid]>target){
          
            h2=mid-1;
        }
        else{
            l2=mid+1;
        }

    }
    
    return new int[]{k,k2};
        
    }
}