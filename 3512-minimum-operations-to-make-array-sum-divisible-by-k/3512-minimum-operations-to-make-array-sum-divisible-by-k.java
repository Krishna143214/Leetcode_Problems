class Solution {
    public int minOperations(int[] nums, int k) {
        int add=0;
        for(int i=0;i<nums.length;i++){
            
            add += nums[i];
        }
        int c=0;
        
        while(add%k!=0){
            c++;
            add--;
        }
        
        return c;
        
    }
}