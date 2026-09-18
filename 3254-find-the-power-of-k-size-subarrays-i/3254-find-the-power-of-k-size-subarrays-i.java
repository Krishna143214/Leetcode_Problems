class Solution {

    
    public int[] resultsArray(int[] nums, int k) {

        if(k==1){
            return nums;
        }

        if(nums.length==1){
            return new int[]{nums[0]};
        }


        int arr[]=new int[nums.length-k+1];
        int l=0;

        
for(int i=0;i<=nums.length-k;i++){
    int f=0;
    int h=-1;
    for(int j=i;j<i+k-1;j++){

        if(nums[j]+1==nums[j+1]){
            h=nums[j+1];
        }
        else{
            f=1;
        }

        

      

   

    }

    if(f==0){
        arr[l]=h;
        l++;
    }
    else{
        arr[l]=-1;
        l++;
    }
}
return arr;


  

        
        
    }
}