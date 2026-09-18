import java.util.Arrays;
class Solution {
    public long maximumMedianSum(int[] nums) {
 Arrays.sort(nums);

 int i=0;
 int j=nums.length-1;
long ans=0;


 while(i<j){
    i++;
    j--;
    ans=ans+nums[j];

    if(i<j){
        j--;
    }


 }


 return ans;
        
    }
}