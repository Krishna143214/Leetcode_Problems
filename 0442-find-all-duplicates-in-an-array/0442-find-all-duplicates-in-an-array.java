import java.util.HashMap;
import java.util.ArrayList;


class Solution {
    public List<Integer> findDuplicates(int[] nums) {

    
    ArrayList<Integer> ll=new ArrayList<>();

    HashMap<Integer,Integer> kk=new HashMap<>();


    for(int i=0;i<nums.length;i++){
        if(kk.containsKey(nums[i])){
            kk.put(nums[i],kk.get(nums[i])+1);
        }
        else{
            kk.put(nums[i],1);
        }
    }   

    for(Map.Entry<Integer,Integer> bb:kk.entrySet()){
        if(bb.getValue()==2){
            ll.add(bb.getKey());
        }
    }


    return ll;     

    }
}