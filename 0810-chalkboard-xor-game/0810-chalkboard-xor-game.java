class Solution {
    public boolean xorGame(int[] nums) {

        int j=0;

        for(int a:nums){
            j=j^a;
        }


        if(j==0||nums.length%2==0){
            return true;
        }

        return false;
        
    }
}