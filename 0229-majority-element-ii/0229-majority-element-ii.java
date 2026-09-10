import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public List<Integer> majorityElement(int[] nums) {

   HashMap<Integer,Integer> kk=new HashMap<>();

   for(int i=0;i<nums.length;i++){
    if(kk.containsKey(nums[i])){
        kk.put(nums[i],kk.get(nums[i])+1);
    }

    else{
        kk.put(nums[i],1);
    }
   }


   ArrayList<Integer> nn=new ArrayList<>();



   for(Map.Entry<Integer,Integer> ll:kk.entrySet()){
    if(ll.getValue()>nums.length/3){
        nn.add(ll.getKey());
    }
   }



   return nn;
        
    }
}