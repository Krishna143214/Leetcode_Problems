import java.util.HashMap;

class Solution {
  static int numval(int a){
    int c=0;
    while(a>0){

        int r=a%10;
        c=c+r;
        a=a/10;
        
    }
    return c;
  }
    public int maximumSum(int[] nums) {
        int res=-1;

        HashMap<Integer,Integer> kk=new HashMap<>();


        for(int i=0;i<nums.length;i++){
            int b=numval(nums[i]);

            if(!kk.containsKey(b)){
                kk.put(b,nums[i]);
            }

            else{
                int a=kk.get(b);
                int r=a+nums[i];

                res=Math.max(res,r);
            }

            if(kk.get(b)<nums[i]){
                kk.put(b,nums[i]);
            }
        }

        return res;


        
    }
}