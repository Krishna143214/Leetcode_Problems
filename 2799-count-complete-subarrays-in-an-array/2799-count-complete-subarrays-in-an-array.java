import java.util.HashSet;
class Solution {
    public int countCompleteSubarrays(int[] nums) {
 HashSet<Integer> ll=new HashSet<>();


 for(int a:nums){
    ll.add(a);
 }
int c=0;
 for(int i=0;i<nums.length;i++ ){
    HashSet<Integer> mm=new HashSet<>();
    for(int j=i;j<nums.length;j++){
        mm.add(nums[j]);


if(ll.size()==mm.size()){
    c++;
}
    }
 }


 return c;


   
        
    }
}