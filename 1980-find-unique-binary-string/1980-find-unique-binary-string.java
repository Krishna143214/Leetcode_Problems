import java.util.HashSet;
class Solution {
    public String findDifferentBinaryString(String[] nums) {

      StringBuilder kk=new StringBuilder();


        for(int i=0;i<nums.length;i++){

    if(nums[i].charAt(i)=='0'){
        kk.append('1');
    }
    else{
        kk.append('0');
    }
          
        }


        return kk.toString();


        
    }
}