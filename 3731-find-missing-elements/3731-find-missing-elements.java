import java.util.HashSet;
import java.util.ArrayList;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
      HashSet<Integer> kk=new HashSet<>();

      int min=Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];
        }
          if(nums[i]>max){
            max=nums[i];
        }
        kk.add(nums[i]);
      }

      ArrayList<Integer> ss=new ArrayList<>();

      
      while(min!=max){
        if(!kk.contains(min)){
            ss.add(min);
        }
        
        min=min+1;
      }


      return ss;
        
    }
}