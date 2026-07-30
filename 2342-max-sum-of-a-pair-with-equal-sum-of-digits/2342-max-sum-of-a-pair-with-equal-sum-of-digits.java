import java.util.HashMap;

class Solution {
    static int numval(int a){
        int count=0;
        while(a>0){
            int r=a%10;
            count=count+r;
            a=a/10;
        }
        return count;
    }
    public int maximumSum(int[] nums) {

        HashMap<Integer,Integer> ll=new HashMap<>();

        int res=-1;

        for(int i=0;i<nums.length;i++){
            int k=numval(nums[i]);
            if(!ll.containsKey(k)){
                ll.put(k,nums[i]);}

            else{
            int val=ll.get(k);
            int out=val+nums[i];

            if(out>res){
                res=out;
            }

            if(val>nums[i]){
                ll.put(k,val);

            }
            else{
                ll.put(k,nums[i]);

            }
            }       
                
                     }


                     return res;
        
        
    }
}