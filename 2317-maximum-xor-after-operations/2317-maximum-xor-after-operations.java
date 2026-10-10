class Solution {
    public int maximumXOR(int[] nums) {

int k=0;
        for(int a:nums){
          k=k|a;  
        }
       return k; 
    }
}