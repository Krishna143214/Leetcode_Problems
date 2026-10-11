class Solution {
    public boolean canAliceWin(int[] nums) {

        int s=0;
        int d=0;


        for(int a:nums){
            if(a<=9){
                s=s+a;
            }

            else{
                d=d+a;
            }
        }


        if(s==d){
            return false;
        }

        return true;
        
    }
}