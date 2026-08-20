class Solution {
    public int[] resultArray(int[] nums) {

        
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        int i=1;
        int j=1;

        int k=2;

        arr1[0]=nums[0];
        arr2[0]=nums[1];

        while(k<nums.length){
            if(arr1[i-1]>arr2[j-1]){
                arr1[i]=nums[k];
                i++;
            }
            else{
                arr2[j]=nums[k];
                j++;
            }

            k++;
        }
int l=0;

        for(int p=0;p<i;p++){
            nums[l]=arr1[p];
            l++;
        }
          for(int p=0;p<j;p++){
            nums[l]=arr2[p];
            l++;
        }

        return nums;
        
    }
}