class Solution {


    public String maxSumOfSquares(int num, int sum) {
      if(num*9<sum){
        return new String("");
      }

      StringBuilder kk=new StringBuilder();

      for(int i=0;i<num;i++){
        int a=Math.min(9,sum);
        kk.append(a);
        sum=sum-a;
      }

return kk.toString();

        
    }
}