class Solution {
    static int counts(int num){
        int res=0;

        while(num>0){
            int r=num%10;
            res=res+r;
            num=num/10;
            
        }

        return res;
    }
    public int largestInteger(int n, int s) {
        int ch=1;

        for(int i=0;i<n;i++){
            ch=ch*10;
        }

        int out=-1;

        for(int i=0;i<ch;i++){

            int val=counts(i);

            if(val==s){
                out=i;
            }


        }



        return out;
        
    }
}