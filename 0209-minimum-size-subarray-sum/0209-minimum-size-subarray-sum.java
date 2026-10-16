class Solution {
    public int minSubArrayLen(int target, int[] nums) {

int s=0;
int l=0;
int minl=Integer.MAX_VALUE;
int i=0;
int j=0;

while(j<nums.length){
    s=s+nums[j];

    if(s<target){
        j++;
    }

    else if(s>=target){
        while(s>=target){
             l=j-i+1;
            minl=Math.min(minl,l);
            s=s-nums[i];
            i++;
        }
        j++;
    }


}


if(minl==Integer.MAX_VALUE){
    return 0;
}
return minl;



}
}