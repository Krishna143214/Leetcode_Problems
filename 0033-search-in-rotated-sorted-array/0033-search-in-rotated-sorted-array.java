class Solution {
    public int search(int[] nums, int target) {

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

int l=0;
int h=k-1;

while(l<=h){
    int mid=(l+h)/2;


    if(nums[mid]==target){
        return mid;
    }
    else if(nums[mid]>target){
        h=mid-1;
    }
    else if(nums[mid]<target){
        l=mid+1;
    }
}




int l2=k;
int h2=nums.length-1;


while(l2<=h2){
    int mid=(l2+h2)/2;

    if(nums[mid]==target){
        return mid;
    }
    else if(nums[mid]>target){
        h2=mid-1;
    }
    else if(nums[mid]<target){
        l2=mid+1;
    }
}

return -1;
    }
}