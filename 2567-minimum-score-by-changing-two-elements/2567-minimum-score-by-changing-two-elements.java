import java.util.Arrays;
class Solution {
    public int minimizeSum(int[] nums) {


Arrays.sort(nums);


int fir=nums[nums.length-2]-nums[1];
int sec=nums[nums.length-1]-nums[2];
int tir=nums[nums.length-3]-nums[0];




int r1 =Math.min(fir,sec);


return Math.min(r1,tir);

        
    }
}