import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {

HashMap<Integer,Integer> kk=new HashMap<>();


for(int i=0;i<nums.length;i++){
    if(kk.containsKey(nums[i])){
        kk.put(nums[i],kk.get(nums[i])+1);
    }

    else{
        kk.put(nums[i],1);

    }
}



for(Map.Entry<Integer,Integer> ll:kk.entrySet()){
    if(ll.getValue()==1){
        return ll.getKey();
    }
}
return -1;
        
    }
}