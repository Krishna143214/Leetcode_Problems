class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;



        for(int a:nums){
            min=Math.min(min,a);
            max=Math.max(max,a);
        }



        for(int a:nums){
            if(a!=min &&a!=max){
                return a;
            }
        }


        return -1;
        
    }
}