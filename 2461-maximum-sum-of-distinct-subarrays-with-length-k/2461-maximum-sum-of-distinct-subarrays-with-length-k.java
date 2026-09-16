import java.util.HashMap;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
int l=0;

long res=0;
long c=0;
HashMap<Integer,Integer> kk=new HashMap<>();

for(int i=0;i<k;i++){
    if(kk.containsKey(nums[i])){
        kk.put(nums[i],kk.get(nums[i])+1);
    }
    else{
        kk.put(nums[i],1);
    }

    c=c+nums[i];
    
}

if(kk.size()==k){
    res=Math.max(c,res);
}

int j=k;


while(j<nums.length){

c=c-nums[l];

kk.put(nums[l],kk.get(nums[l])-1);

if(kk.get(nums[l])<=0){
    kk.remove(nums[l]);
}
l++;

c=c+nums[j];


  if(kk.containsKey(nums[j])){
        kk.put(nums[j],kk.get(nums[j])+1);
    }
    else{
        kk.put(nums[j],1);
    }

if(kk.size()==k){
   res=Math.max(c,res);
}

j++;

}


return res;






    }}
