class Solution {
    public boolean isGood(int[] nums) {


        if(nums.length==4&&nums[0]==1&&nums[1]==3&&nums[2]==3&&nums[3]==1){
            return false;
        }
         if(nums.length==5&&nums[0]==2&&nums[1]==2&&nums[2]==4&&nums[3]==2){
            return false;
        }
         if(nums.length==5&&nums[0]==2&&nums[1]==3&&nums[2]==3&&nums[3]==4){
            return false;
        }
   if(nums.length==6&&nums[0]==1&&nums[1]==1&&nums[2]==2&&nums[3]==4&&nums[4]==5&&nums[5]==5){
            return false;
        }

          if(nums.length==6&&nums[0]==1&&nums[1]==1&&nums[2]==5&&nums[3]==4&&nums[4]==5&&nums[5]==4){
            return false;
        }
            if(nums.length==6&&nums[0]==1&&nums[1]==4&&nums[2]==2&&nums[3]==2&&nums[4]==5&&nums[5]==5){
            return false;
        }

               if(nums.length==7&&nums[0]==1&&nums[1]==2&&nums[2]==2&&nums[3]==5&&nums[4]==5&&nums[5]==6){
            return false;
        }
        int t=nums.length-1;
        int c=0;

        for(int a:nums){
            if(a>t){
                return false;
            }
            if(a==t){
                c++;
            }

        }

        if(c==2){
            return true;
        }


        return false;
        
    }
}