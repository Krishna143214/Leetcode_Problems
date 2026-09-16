class Solution {


    static int rev(int a){
        int res=0;

        while(a>0){
            int r=a%10;
            res=res*10+r;
            a=a/10;
        }

        return res;
    }
    public boolean sumOfNumberAndReverse(int num) {


       


        for(int i=0;i<=num;i++){
      int a=rev(i);
      if(a+i==num){
        return true;
      }
 
        }

   

   return false;       
    }}