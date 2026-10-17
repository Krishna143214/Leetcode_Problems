import java.util.HashMap;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {


long s=0;
long ms=0;
HashMap<Integer,Integer> kk=new HashMap<>();

for(int i=0;i<k;i++){

    if(kk.containsKey(nums[i])){
        kk.put(nums[i],kk.get(nums[i])+1);
    }
    else{
        kk.put(nums[i],1);
    }
    s=s+nums[i];

}


if(kk.size()==k){
    ms=Math.max(ms,s);
}

int i=0;
int j=k;


while(j<nums.length){

       
        kk.put(nums[i],kk.get(nums[i])-1);


        if(kk.get(nums[i])==0){
            kk.remove(nums[i]);
        }
        s=s-nums[i];
        i++;





    if(kk.containsKey(nums[j])){
        kk.put(nums[j],kk.get(nums[j])+1);
    }
    else{
        kk.put(nums[j],1);
    }
    s=s+nums[j];
    j++;

    if(kk.size()==k){
         ms=Math.max(ms,s);

    }


        
    
   


}


return ms;





    }}
