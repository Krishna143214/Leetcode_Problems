class Solution {
    public int longestSubarray(int[] nums) {

        int max=Integer.MIN_VALUE;


        for(int a:nums){
            max=Math.max(a,max);
        }


        int out=0;
        int c=0;

        for(int a:nums){
            if(a==max){
                c++;
                out=Math.max(out,c);
            }
            else{
                c=0;
            }
        }


        return out;
        
    }
}