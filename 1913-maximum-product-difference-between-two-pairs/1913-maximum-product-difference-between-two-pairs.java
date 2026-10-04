
class Solution {
    public int maxProductDifference(int[] nums) {

int indl=-1;
int inds=-1;
        int lar=Integer.MIN_VALUE;
        int s=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(lar<nums[i]){
                lar=nums[i];
                indl=i;
            }
          if(s>nums[i]){
            s=nums[i];
            inds=i;
          }
        }


       int slar=Integer.MIN_VALUE;

          for(int a=0;a<nums.length;a++){
            if(a==indl){
                continue;
            }
            slar=Math.max(slar,nums[a]);
  
        }

        if(slar==Integer.MIN_VALUE){
            slar=1;
        }


           int smal=Integer.MAX_VALUE;

          for(int a=0;a<nums.length;a++){
            if(a==inds){
                continue;
            }
            smal=Math.min(smal,nums[a]);
  
        }

        if(smal==Integer.MAX_VALUE){
            smal=1;
        }


 int a=lar*slar;
        int b=s*smal;


        return a-b;


        
    }
}