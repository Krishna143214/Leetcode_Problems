class Solution {
    public int minOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int c=0;

        for(int a:nums){
            if(a==k||a>k){
                break;
            }
            c++;
        }


        return c;
        
    }
}