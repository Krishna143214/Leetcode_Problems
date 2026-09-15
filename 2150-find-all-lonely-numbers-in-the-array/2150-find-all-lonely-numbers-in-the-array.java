import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public List<Integer> findLonely(int[] nums) {
HashMap<Integer,Integer> kk=new HashMap<>();


for(int i=0;i<nums.length;i++){
    if(kk.containsKey(nums[i])){

        kk.put(nums[i],kk.get(nums[i])+1);

    }

    else{
        kk.put(nums[i],1);
    }

}

    ArrayList<Integer> ll=new ArrayList<>();


    for(int i=0;i<nums.length;i++){
        if(kk.get(nums[i])==1){
            if(!kk.containsKey(nums[i]+1)){
if(!kk.containsKey(nums[i]-1)){
    ll.add(nums[i]);
}
            }
        }
    }

    return ll;


        
    }
}